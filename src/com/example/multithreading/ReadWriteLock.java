package com.example.multithreading;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.stream.IntStream;

public class ReadWriteLock {

    public static Notepad pad = new Notepad("Empty Board");
    public static RWLock sem = new RWLock();

    // Imagine you have an application where you have multiple readers and a single writer.
    // You are asked to design a lock which lets multiple readers read at the same time,
    // but only one writer write at a time.
    public static void main(String[] args) {

        ReentrantReadWriteLock lock = new ReentrantReadWriteLock();


        new Thread(() -> {
            IntStream.iterate(1, (i) -> i + 1)
                    .forEach((i) -> {

                        sem.acquireReadLock(1);
                        System.out.println(Thread.currentThread().getName() + " reading... " + pad.getContent());
                        sem.releaseReadLock(1);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
        }, "Reader 1 Thread").start();

        new Thread(() -> {
            IntStream.iterate(1, (i) -> i + 1)
                    .forEach((i) -> {
                        sem.acquireReadLock(1);
                        System.out.println(Thread.currentThread().getName() + " reading... " + pad.getContent());
                        sem.releaseReadLock(1);
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    });
        }, "Reader 2 Thread").start();

        new Thread(() -> {

            IntStream.iterate(1, (i) -> i + 1)
                    .forEach((i) -> {
                        try {
                            sem.acquireReadLock(2);
                            sem.acquireWriteLock();
                            pad.setContent(String.format("From %s : Day %s", Thread.currentThread().getName(), i));
                            sem.releaseReadLock(2);
                            sem.releaseWriteLock();
                            Thread.sleep(10000);
                        } catch (Exception ex) {
                            ex.printStackTrace();
                        }
                    });

        }, "Writer Thread").start();

    }
}

class Notepad {
    public String content = "";

    public Notepad(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

class RWLock {
    Semaphore read;
    Semaphore write;

    public RWLock() {
        read = new Semaphore(2);
        write = new Semaphore(1);
    }

    public void acquireReadLock(int n) {
        try {
            read.acquire(n);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void acquireWriteLock() {
        try {
            write.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void releaseReadLock(int n) {
        read.release(n);
    }

    public void releaseWriteLock() {
        write.release();
    }
}