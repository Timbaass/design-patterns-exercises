package com.timbas;

import com.timbas.behoviors.impl.FlyBehavior;
import com.timbas.ducks.Duck;
import com.timbas.ducks.impl.RubberDuck;

public class Main {
    public static void main() {
        Duck rubberDuck = new RubberDuck();
        rubberDuck.performFly();
        rubberDuck.setFlyBehavior(new FlyBehavior());
        rubberDuck.performFly();
    }
}