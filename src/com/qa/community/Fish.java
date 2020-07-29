package com.qa.community;

public class Fish extends Animal implements Swimable {

    private int fins;

    @Override
    public String speak() {
        return "glub glub";
    }

    public int getFins() {
        return fins;
    }

    public void setFins(int fins) {
        this.fins = fins;
    }

    @Override
    public String swim() {
        return "imma do a swim in the sea m80";
    }

}
