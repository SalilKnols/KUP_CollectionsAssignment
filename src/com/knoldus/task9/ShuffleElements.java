package com.knoldus.task9;

import java.util.Collections;
import java.util.LinkedList;
public class ShuffleElements{
    public static void main(String[] args)
    {
        LinkedList<Integer> shufflingList = new LinkedList<>();
        shufflingList.add(10);
        shufflingList.add(9);
        shufflingList.add(11);
        shufflingList.add(101);
        shufflingList.add(161);
        shufflingList.add(13);

        System.out.println("The list before shuffling elements: ");
        for(Integer list : shufflingList){
            System.out.print(list +" ");
        }
        Collections.shuffle(shufflingList);
        System.out.println("\nThe list after shuffling elements: ");
        for(Integer list: shufflingList)
        {
            System.out.print(list +" ");
        }
    }
}