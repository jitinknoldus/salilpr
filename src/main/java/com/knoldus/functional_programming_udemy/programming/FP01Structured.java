package com.knoldus.functional_programming_udemy.programming;

import java.util.List;


public class FP01Structured {
    public static void main(String[] args) {
        printAllNumbersInListStructured(List.of(12,9,13,4,6,12,84,6));
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for(Integer el: integers){
            System.out.println(el);
        }
    }
}
