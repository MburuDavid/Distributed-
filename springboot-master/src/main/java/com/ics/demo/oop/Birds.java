package com.ics.demo.oop;

public class Birds extends Animal implements AnimalInterface{

    private TypeOfBeak typeOfBeak;

    public Birds(String name, TypeOfEye typeOfEye, TypeOfBeak typeOfBeak) {
        super(name, typeOfEye);
        this.typeOfBeak = typeOfBeak;
    }

    public TypeOfBeak getTypeOfBeak() {
        return typeOfBeak;
    }

    public void setTypeOfBeak(TypeOfBeak typeOfBeak) {
        this.typeOfBeak = typeOfBeak;
    }
//    public void printBirdDetails(){
//        System.out.println("Name:"+getName()+
//                "Type of Eye:"+getTypeOfBeak()+
//                "Type of Beak:"+getTypeOfBeak());
//    }


    @Override
    public String toString() {
        return "Birds{" +
                "typeOfBeak=" + typeOfBeak +
                ", name='" + name + '\'' +
                ", typeOfEye=" + typeOfEye +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Birds Fly");
    }

}
