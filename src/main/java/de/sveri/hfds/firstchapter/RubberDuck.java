package de.sveri.hfds.firstchapter;

/**
 * Created by sveri on 04.09.2015.
 */
public class RubberDuck extends Duck {

    public RubberDuck(Quack q) {
        this.q = q;
    }

    @Override
    void display() {
        System.out.println("this = " + this);
    }
}
