package com.example.designpatternsdemo.Structural.Decorator;

/**
 * 具体装饰者类：定义给构件对象“贴上”附加责任。
 * 摩卡咖啡
 */
public class Mocha extends ConimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ",摩卡";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
