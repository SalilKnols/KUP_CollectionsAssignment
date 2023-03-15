package com.knoldus.task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddingElements{
    public static void main(String [] args){

        List<String> names = new ArrayList<String>();
        names.add("Salil");
        names.add("Rahul");
        names.add("Sahil");
        System.out.println("List before adding the elements : ");
        for (String index: names){
            System.out.print(index + " ");
        }
        Collections.addAll(names,"Anshika","Rishika");
        System.out.println("\nAfter adding elements:");
        for (String index: names){
            System.out.print(index+" ");
        }

    }
}

