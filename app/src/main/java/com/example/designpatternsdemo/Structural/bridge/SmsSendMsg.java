package com.example.designpatternsdemo.Structural.bridge;

public class SmsSendMsg implements SendMsgInterface {
    @Override
    public void sendMsg() {
        System.out.println("Sms 方式发送");
    }

}