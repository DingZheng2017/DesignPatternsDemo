package com.example.designpatternsdemo.Behavioral.command;

public class BakeChickenWingCommand extends Command {
    public BakeChickenWingCommand(Barbecuer receiver) {
        super(receiver);
    }

    @Override
    public void ExecuteCommand() {
        receiver.BakeChickenWing();
    }
}
