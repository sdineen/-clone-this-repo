package com.qa.community;

public class Mammal extends Animal{

    private String fur;

    @Override
    public String speak() {
        return "yoo hoo";
    }

    public String getFur() {
        return fur;
    }

    public void setFur(String fur) {
        this.fur = fur;
    }
    
}
