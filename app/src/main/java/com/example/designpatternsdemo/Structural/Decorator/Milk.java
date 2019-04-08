package com.example.designpatternsdemo.Structural.Decorator;

/**
 * 牛奶咖啡
 */
public class Milk extends ConimentDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " ,牛奶";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
