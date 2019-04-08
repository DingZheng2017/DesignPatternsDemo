package com.example.designpatternsdemo.Structural.Decorator;

/**
 *  抽象装饰者类，所有的具体装饰者都必须继承这个类
 */
public abstract class ConimentDecorator extends Beverage{
    public abstract String getDescription();
}
