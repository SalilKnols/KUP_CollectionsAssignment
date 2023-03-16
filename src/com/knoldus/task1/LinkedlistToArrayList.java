package com.knoldus.task1;

import java.util.LinkedList;

public class LinkedlistToArrayList {
    public static void main(String[] args) {

        //LinkedList creation with 5 objects
        LinkedList<String> student = new LinkedList<>();
        student.add("Salil");
        student.add("Anshika");
        student.add("Rahul");
        student.add("Riya");
        student.add("Sahil");

        // Converting the LinkedList to an Array
        String[] student_array = student.toArray(new String[0]);


        for (String index : student) {
            System.out.println(index);
        }
    }
}