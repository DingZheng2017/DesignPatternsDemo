package com.example.designpatternsdemo.Structural.Decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "混合咖啡";
    }

    @Override
    public double cost() {
        return .89;
    }
}
