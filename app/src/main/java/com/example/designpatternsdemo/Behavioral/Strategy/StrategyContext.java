package com.example.designpatternsdemo.Behavioral.Strategy;

public class StrategyContext {
    private static Strategy strategy;

    public StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public static int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
