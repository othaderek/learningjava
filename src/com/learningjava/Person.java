package com.learningjava;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String initialName){
        this.age = 0;
        this.name = initialName;
        this.height = 0;
        this.weight = 0;

    }

    public void setHeight(int height){
        this.height = height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getAge(){
        return age;
    }

    public void printPerson(){
        System.out.println("This person's name is " + this.name + " and their age is " + this.age);
    }

    public void becomeOlder(){
        this.age++;
    }
}
