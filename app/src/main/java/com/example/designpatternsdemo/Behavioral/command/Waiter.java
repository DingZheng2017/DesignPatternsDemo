package com.example.designpatternsdemo.Behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    //增加存放具体命令的容器
    private List<Command> orders = new ArrayList<>();

    //设置订单
    public void addOrder(Command command) {
        if (command instanceof BakeChickenWingCommand) {
            System.out.println("服务员:鸡翅没有了,请点别的烧烤.");
        } else {
            orders.add(command);
            System.out.println("增加订单:" + System.currentTimeMillis());
        }
    }

    //取消订单
    public void cancelOrder(Command command) {
        orders.remove(command);
        System.out.println("取消订单:" + +System.currentTimeMillis());
    }

    //通知全部执行
    public void notifyOrders() {
        for (Command order : orders) {
            order.ExecuteCommand();
        }
    }
}

