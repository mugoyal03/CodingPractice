package com.example.streams;

import java.util.*;
import java.util.stream.Collectors;

public class SpilteratorDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Mukesh","Yogesh","Ankush","Dhiraj","Munna","Golu");
        Collections.sort(list);
        list.parallelStream().filter((s)->s.startsWith("M")).filter(s->s.startsWith("Mu")).map(s->s.substring(0,3)).collect(Collectors.toList()).forEach(System.out::println);
        list.spliterator().forEachRemaining(System.out::print);

        for(Spliterator<String> s = list.spliterator();s.tryAdvance(System.out::println);)
            continue;

    }
}
