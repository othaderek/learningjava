package com.learningjava;

import java.util.Scanner;

public class PrintStars {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        greet();
        Integer response = scanner.nextInt();
        countStars(response);
    }

    public static void greet(){
        System.out.println("Enter the amount of stars that you want printed.");
    }

    public static void countStars(Integer integer){

        String starString = "";

        for (int i = integer; i > 0; i--){
            starString += printStar();
        }

        System.out.println(starString);

    }

    public static String printStar(){
        return "*";
    }

}
