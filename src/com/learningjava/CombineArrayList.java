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
        list2.add(2);

//        System.out.println(combine(list1, list2));
        System.out.println(smartCombine(list1, list2));

    }

    public static ArrayList<Integer> combine(ArrayList<Integer> list1, ArrayList<Integer> list2 ){

        for (int i : list2){
            list1.add(i);
        }
        return(list1);
    }

    public static ArrayList<Integer> smartCombine(ArrayList<Integer> list1, ArrayList<Integer> list2){

        boolean answer;

        for (int i : list2){

            answer = list1.contains(i);

            if (!answer){
                list1.add(i);
            }
            
        }
        return(list1);
    }


}
