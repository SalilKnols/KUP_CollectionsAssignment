package com.knoldus.task12;
import java.util.LinkedList;

public class FirstElement{
    public static void main(String[] args)
    {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(4);
        numbers.add(3);

        System.out.println("The given list is: ");
        System.out.println(numbers);

        System.out.println("\nFirst way to print first element : "+numbers.peek());
        System.out.println("\nSecond way to print first element  : "+numbers.peekFirst());
        System.out.println("\nThird way to print first element: "+numbers.getFirst());

    }
}
