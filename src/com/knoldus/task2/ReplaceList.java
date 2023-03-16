package com.knoldus.task2;

import java.util.ArrayList;

public class ReplaceList {
        public static void main(String[] args) {

            // Create an ArrayList with 5 objects
            ArrayList<String> studios = new ArrayList<>();
            studios.add("Java");
           studios.add("Scala");
            studios.add("DEvops");
            studios.add("AIML");
            studios.add("Test automation");


            // Replace all elements with one new object
            String studio = "Knoldus";

            for (int index = 0; index < studios.size(); index++) {
                studios.set(index, studio);
            }

            for (String name : studios) {
                System.out.println(name);
            }

        }

    }


