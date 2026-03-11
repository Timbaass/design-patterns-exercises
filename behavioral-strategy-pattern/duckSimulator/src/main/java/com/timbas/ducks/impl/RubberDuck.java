package com.timbas.ducks.impl;

import com.timbas.behoviors.impl.NoWayFlyBehavior;
import com.timbas.behoviors.impl.NoWayQuackBehavior;
import com.timbas.ducks.Duck;

public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new NoWayFlyBehavior();
        quackBehavior = new NoWayQuackBehavior();
    }

    @Override
    public void display(){
        System.out.println("I am a rubber duck!");
    }
}
