package com.qa.community;

public class Animal {

    private int age;
    private int legs;
    private String name;
    int i;
    int j;

    int id;
    
    public Animal() {

    }

    public Animal(int age, int legs, String name) {
        super();
        this.age = age;
        this.legs = legs;
        this.name = name;
    }

    public String eat() {
        return "om nom nom";
    }

    public String speak() {
        return "generic animal noises";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
