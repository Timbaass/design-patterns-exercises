package com.timbas.behoviors.impl;

import com.timbas.behoviors.IFlyBehavior;

public class NoWayFlyBehavior implements IFlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can not fly!");
    }
}
