package com.example.multithreading;

import java.util.concurrent.Semaphore;

public class Producer11 {

    public static void main(String[] args) {

        Call call = new Call();

        Producer1 producer = new Producer1(call);
        Consumer1 consumer = new Consumer1(call);

        Semaphore sem = new Semaphore(1);

    }



}

class Call{
    public boolean flag=false;// Consumer

    public synchronized boolean getFlag(){
        return flag;
    }

    public synchronized void setFlag(boolean flag){
        this.flag = flag;
    }

    public void print(String str){
        System.out.println(str);
    }
}
 class Producer1 implements Runnable{

    Thread t1;
    Call call;

     public Producer1(Call call) {
         this.call = call;
         this.t1=new Thread(this,"Producer");
         this.t1.start();
     }

     @Override
     public void run() {

         for(int i=1;i<=5;i++){

             while(call.getFlag()){
                 continue;
             }
             call.print("Producing Messsage :" + i);

             call.flag= true;
         }

     }
 }



class Consumer1 implements Runnable{
    Thread t2;
    Call call;
    public Consumer1(Call call) {
        this.call = call;
        this.t2 = new Thread(this,"Consumer");
        this.t2.start();
    }

    @Override
    public void run() {

        for(int i=1;i<=5;i++){

            while(!call.getFlag() ){
                continue;
            }
            call.print("Consuming Messsage :" + i);
            call.flag = false;
        }

    }
}