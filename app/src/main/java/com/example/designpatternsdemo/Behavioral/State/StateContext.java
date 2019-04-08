package com.example.designpatternsdemo.Behavioral.State;

/**
 * 义一个环境类来维护State接口
 */
public class StateContext {
    private State state;

    public StateContext() {}

    public StateContext(State state) {
        this.state = state;
    }

    public void setState(State state) {
        System.out.println("订单信息已更新！");
        this.state = state;
        this.state.handle();
    }

}
