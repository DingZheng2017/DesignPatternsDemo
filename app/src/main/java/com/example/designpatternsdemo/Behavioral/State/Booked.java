package com.example.designpatternsdemo.Behavioral.State;

public class Booked implements State {
    @Override
    public void handle() {
        System.out.println("您已下单！");
    }

}
