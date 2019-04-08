package com.example.designpatternsdemo.Structural.Decorator;

/**
 * 具体构件类
 * 定义一个具体的准备接受附加责任的类，其必须实现Component接口
 */
public class DarkRoast extends Beverage {
    public DarkRoast(){
        description = "深焙咖啡";
    }

    @Override
    public double cost() {
        return 1.0;
    }
}
