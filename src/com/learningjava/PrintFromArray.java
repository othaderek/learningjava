package com.learningjava;

import java.util.ArrayList;

public class PrintFromArray {

    public static void main(String args[]){

        ArrayList<Integer> arrayOfNumbers = new ArrayList<Integer>();

        arrayOfNumbers.add(1);
        arrayOfNumbers.add(2);
        arrayOfNumbers.add(3);
        arrayOfNumbers.add(4);
        arrayOfNumbers.add(5);

        printInt(arrayOfNumbers);

    }

    public static int printInt(ArrayList<Integer> array){
        for (int num : array){
            System.out.println(num);
        }
        return 1;
    }


}
