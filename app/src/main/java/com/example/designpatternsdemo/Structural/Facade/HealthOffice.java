package com.example.designpatternsdemo.Structural.Facade;

class HealthOffice implements Executive{

    @Override
    public void approve() {
        System.out.println("卫生局通过审批");
    }

}