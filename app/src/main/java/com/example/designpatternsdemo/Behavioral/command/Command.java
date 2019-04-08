package com.example.designpatternsdemo.Behavioral.command;
public abstract class Command
{
    protected Barbecuer receiver;
    public Command(Barbecuer receiver)
    {
        this.receiver = receiver;
    }
    //执行命令
    abstract public void ExecuteCommand();
}
