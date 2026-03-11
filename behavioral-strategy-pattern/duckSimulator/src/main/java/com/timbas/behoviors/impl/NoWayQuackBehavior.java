package com.timbas.behoviors.impl;

import com.timbas.behoviors.IQuackBehavior;

public class NoWayQuackBehavior implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Can not quack!");
    }
}
