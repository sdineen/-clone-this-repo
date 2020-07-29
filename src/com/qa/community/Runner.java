package com.qa.community;

public class Runner {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Bird bird = new Bird();
        Penguin penguin = new Penguin();
        Fish fish = new Fish();
        FlyingFish flyingFish = new FlyingFish();

        System.out.println("---ANIMAL---");
        System.out.println(animal.speak());
        System.out.println(animal.eat());

        System.out.println("\n---BIRD---");
        System.out.println(bird.speak());
        System.out.println(bird.eat());

        // can't do this - Bird doesn't implement Flyable because some birds don't fly
        // System.out.println(bird.fly());

        System.out.println("\n---PENGUIN---");
        System.out.println(penguin.speak());
        System.out.println(penguin.eat());

        // can't do this - Penguin doesn't implement Flyable because Penguins can't fly!
        // if we implemented Flyable in Bird, the Penguin would try to fly and fall off
        // a cliff!
        // System.out.println(penguin.fly());

        // can do this - Penguin implements Swimable but not Flyable
        System.out.println(penguin.swim());

        System.out.println("\n---FISH---");
        System.out.println(fish.speak());
        System.out.println(fish.eat());

        // can do this - Fish implements Swimable because all fish can swim
        System.out.println(fish.swim());

        System.out.println("\n---FLYINGFISH---");
        System.out.println(flyingFish.speak());
        System.out.println(flyingFish.eat());

        // can do both - FlyingFish extends from Fish, so can swim, but also implements
        // Flyable, so it can also fly
        System.out.println(flyingFish.swim());
        System.out.println(flyingFish.fly());

    }

}
