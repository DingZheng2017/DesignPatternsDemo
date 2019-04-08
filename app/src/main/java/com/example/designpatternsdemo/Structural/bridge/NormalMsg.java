package com.example.designpatternsdemo.Structural.bridge;

public class NormalMsg extends Msg {

    public NormalMsg(SendMsgInterface smi) {
        super(smi);
    }

    @Override
    public void send() {
        System.out.println("普通信息");
    }

}
