package com.knoldus.task6;

import java.util.LinkedList;

public class SwapTheLinkedListElements {
    public static void main(String[] args) {

        // Create a LinkedList with some elements
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("original list : " + numbers);

        // Swap the second and fourth number in the list
        int number1 = numbers.get(1);
        int number2= numbers.get(3);
        numbers.set(1, number2);
        numbers.set(3, number1);

        System.out.println("new list : " + numbers);

    }
}