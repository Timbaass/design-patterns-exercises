package com.timbas.ducks;

import com.timbas.behoviors.IFlyBehavior;
import com.timbas.behoviors.IQuackBehavior;
import com.timbas.behoviors.impl.FlyBehavior;
import com.timbas.behoviors.impl.QuackBehavior;

public abstract class Duck {
    protected IFlyBehavior flyBehavior;
    protected IQuackBehavior quackBehavior;

    public void display(){};

    public void performQuack(){
        quackBehavior.quack();
    }

    public void performFly(){
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
