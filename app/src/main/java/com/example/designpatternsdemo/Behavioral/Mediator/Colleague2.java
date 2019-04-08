package com.example.designpatternsdemo.Behavioral.Mediator;

class Colleague2 extends Colleague{
    public Colleague2(Mediator m){
        super(m);
    }
    public void action(){
        System.out.println("this is an action from Colleague2");
    }
}
