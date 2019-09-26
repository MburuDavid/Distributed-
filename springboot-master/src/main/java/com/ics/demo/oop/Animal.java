package com.ics.demo.oop;

public abstract class Animal {
    protected String name;
    protected TypeOfEye typeOfEye;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TypeOfEye getTypeOfEye() {
        return typeOfEye;
    }

    public void setTypeOfEye(TypeOfEye typeOfEye) {
        this.typeOfEye = typeOfEye;
    }

    public Animal(String name, TypeOfEye typeOfEye) {
        this.name = name;
        this.typeOfEye = typeOfEye;
    }

}
