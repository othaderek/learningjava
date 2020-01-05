package com.learningjava;

import java.util.ArrayList;

public class CombineArrayList {

    public static void main(String args[]){

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        list1.add(1);
        list1.add(2);

        list2.add(3);
        list2.add(4);
        list2.add(5);

        System.out.println(combine(list1, list2));

    }

    public static int combine(ArrayList<Integer> list1, ArrayList<Integer> list2 ){

        int num1 = 0;

        for (int i : list1){
            num1 += i;
        }

        for (int i : list2){
            num1 += i;
        }
        return num1;

    }

}
