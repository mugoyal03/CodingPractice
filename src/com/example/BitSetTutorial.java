package com.example;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.vm.VM;

public class BitSetTutorial {

    public static void main(String[] args) {
        boolean[] bits = new boolean[1025];
        System.out.println(VM.current().details());
        System.out.println(ClassLayout.parseInstance(bits).toPrintable());

        Runtime env = Runtime.getRuntime();
    }
}
