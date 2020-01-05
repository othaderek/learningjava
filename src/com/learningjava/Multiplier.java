package com.learningjava;

public class Multiplier {

    private int number;

    public Multiplier(int initialNumber){
        this.number = initialNumber;
    }

    public int multiply(int numberToMultiply){
        return this.number * numberToMultiply;
    }

}
