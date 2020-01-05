package com.learningjava;

public class Person {

    private String name;
    private int age;

    public Person(String initialName){
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson(){
        System.out.println("This person's name is " + this.name + " and their age is " + this.age);
    }

}
