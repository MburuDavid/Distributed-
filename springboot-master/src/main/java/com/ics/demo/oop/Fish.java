package com.ics.demo.oop;

public class Fish extends Animal implements AnimalInterface{
    private int numberOfFin;

    public Fish(String name, TypeOfEye typeOfEye, int numberOfFin) {
        super(name, typeOfEye);
        this.numberOfFin = numberOfFin;
    }

    public int getNumberOfFin() {
        return numberOfFin;
    }

    public void setNumberOfFin(int numberOfFin) {
        this.numberOfFin = numberOfFin;
    }


    @Override
    public String toString() {
        return "Fish{" +
                "numberOfFin=" + numberOfFin +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Fish swim");
    }
}
