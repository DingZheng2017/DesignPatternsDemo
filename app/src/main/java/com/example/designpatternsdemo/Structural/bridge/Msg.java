package com.example.designpatternsdemo.Structural.bridge;

public abstract class Msg {
    private SendMsgInterface smi;

    public Msg(SendMsgInterface smi) {
        this.smi = smi;
    }

    public abstract void send();
}
