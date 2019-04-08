package com.example.designpatternsdemo.Behavioral.command;

public class BakeMuttonCommand extends Command {

    public BakeMuttonCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExecuteCommand() {
        receiver.BakeMutton();
    }
}
