package com.example.designpatternsdemo.Structural.Facade;

class SaicOffice implements Executive{

    @Override
    public void approve() {
        System.out.println("工商局完成审核，办法营业执照");
    }

}