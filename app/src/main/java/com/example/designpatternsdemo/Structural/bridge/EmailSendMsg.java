package com.example.designpatternsdemo.Structural.bridge;

public class EmailSendMsg implements SendMsgInterface {
    @Override
    public void sendMsg() {
        System.out.println("Email 方式发送");
    }
}
