package de.sveri.hfds.firstchapter;

/**
 * Created by sveri on 04.09.2015.
 */
public class Main {

    public static void main(String[] args) {
        RubberDuck rubberDuck = new RubberDuck(new QuackImpl());
        rubberDuck.quack();
        rubberDuck.fly();
    }
}
