package com.example.designpatternsdemo.Behavioral.Mediator;

public class ConcreteMediator implements Mediator{
    private Colleague1 col1;
    private Colleague2 col2;
    public void colleagueChanged(Colleague c) {
        col1.action();
        col2.action();
    }
    public void createConcreteMediator() {
        col1 = new Colleague1(this);
        col2 = new Colleague2(this);
    }
    private Colleague1 getCol1() {
        return col1;
    }
    public Colleague2 getCol2() {
        return col2;
    }
}