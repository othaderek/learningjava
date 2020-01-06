package com.learningjava;

public class Reformatory {

    private int measured;
    private static int allMeasured = 0;

    public Reformatory(){
        this.measured = 0;
    }

    public int getMeasured() {
        return measured;
    }

    public void setMeasured(int measured) {
        this.measured = measured;
    }


    public int weight(Person person){
        this.setMeasured(this.getMeasured() + 1);
        return person.getWeight();
    }

    public void feed(Person person){
        person.setWeight(person.getWeight() + 1);
    }

    public int totalWeightsMeasured(){
        return this.measured;
    }

}
