package com.timbas.behoviors.impl;

import com.timbas.behoviors.IQuackBehavior;

public class QuackBehavior implements IQuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
