package com.knoldus.task4;
import java.util.LinkedHashSet;
public class LinkedHashSetExample {
        public static void main(String[] args) {

            // Create a LinkedHashSet with 5 numbers
            LinkedHashSet<Integer> number_set = new LinkedHashSet<>();
            number_set.add(1);
            number_set.add(2);
            number_set.add(3);
            number_set.add(4);
            number_set.add(5);

            System.out.println( "Original number set: "+number_set);

            // Remove an element from the set
            number_set.remove(2);

            System.out.println("New  set: " + number_set);
        }
    }

