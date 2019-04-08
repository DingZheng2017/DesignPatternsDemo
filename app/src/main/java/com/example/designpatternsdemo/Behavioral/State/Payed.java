package com.example.designpatternsdemo.Behavioral.State;

public class Payed implements State {
    @Override
    public void handle() {
        System.out.println("您已付款！");
    }

}
