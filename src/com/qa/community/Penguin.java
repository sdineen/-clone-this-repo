package com.qa.community;

public class Penguin extends Bird implements Swimable {

    private boolean isEmperor;

    @Override
    public String speak() {
        return "noot noot";
    }

    public boolean isEmperor() {
        return isEmperor;
    }

    public void setEmperor(boolean isEmperor) {
        this.isEmperor = isEmperor;
    }

    @Override
    public String swim() {
        return "imma pengy and imma do a SWIMB to get some fishies";
    }

}
