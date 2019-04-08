package com.example.designpatternsdemo.Structural.Facade;

class RevenueOffice implements Executive{

    @Override
    public void approve() {
        System.out.println("税务局完成登记，定时回去收税");
    }

}
