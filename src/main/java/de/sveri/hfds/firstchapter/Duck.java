package de.sveri.hfds.firstchapter;

/**
 * Created by sveri on 04.09.2015.
 */
public abstract class Duck {

    Quack q;

    Fly f;

    public void swim(){
        System.out.println("I am swimming");
    }

    public void quack(){
        q.quack();
    }

    public void fly(){
        f.fly();
    }

    abstract void display();
}
