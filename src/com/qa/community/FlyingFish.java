package com.qa.community;

public class FlyingFish extends Fish implements Flyable {

    @Override
    public String fly() {
        return "imma fishy that CAN FLY, aw yeah";
    }

}
