package com.timbas.behoviors.impl;

import com.timbas.behoviors.IFlyBehavior;

public class FlyBehavior implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can fly!");
    }
}
