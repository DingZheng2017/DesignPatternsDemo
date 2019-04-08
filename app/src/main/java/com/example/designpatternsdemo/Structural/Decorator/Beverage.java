package com.example.designpatternsdemo.Structural.Decorator;

/**
 * 抽象构件类（Component）
 * 给出一个抽象的接口，用以规范准备接收附加责任的对象
 */
public abstract class Beverage {
    String description = "未知的咖啡";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
