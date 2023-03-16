package com.knoldus.task7;

import java.util.ArrayList;

public class CloneList{
        public static void main(String[] args) {

            ArrayList<Integer> originalnumberList = new ArrayList<>();
            originalnumberList.add(1);
            originalnumberList.add(2);
            originalnumberList.add(4);
            originalnumberList.add(6);

            //Printing original list using foreach loop
            System.out.println("Original array elements are : ");
            for (Integer list: originalnumberList) {
                System.out.println(list);
            }

            // Using clone() method
            ArrayList<Integer> cloneList = (ArrayList<Integer>) originalnumberList.clone();

            //Printing the cloned array using foreach loop
            System.out.println("Cloned array elements are : ");
            for (Integer list: cloneList) {
                System.out.println(list);

            }
        }
}
