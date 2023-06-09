package com.knoldus.task5;

import java.util.ArrayList;
import java.util.Collections;

public class SwapElement {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println("Before swapping: " + numbers);

        // Swap elements at index 2 and index 3
        Collections.swap(numbers, 2, 3);

        System.out.println("After swapping: " + numbers);
    }
}