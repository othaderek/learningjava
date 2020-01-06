package com.learningjava;

public class Person {

    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String initialName, int initialAge, int initialWeight, int initialHeight){
        this.age = initialAge;
        this.name = initialName;
        this.height = initialHeight;
        this.weight = initialWeight;

    }

    public String getName() {
        return name;
    }

    public void setHeight(int height){
        this.height = height;
    }

    public int getHeight(){
        return this.height;
    }

    public void setWeight(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return this.weight;
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
