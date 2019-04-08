package com.example.designpatternsdemo.Structural.bridge;

public class ImportantMsg extends Msg {
    public ImportantMsg(SendMsgInterface smi) {
        super(smi);
    }

    @Override
    public void send() {
        System.out.println("紧急信息");
    }
}
