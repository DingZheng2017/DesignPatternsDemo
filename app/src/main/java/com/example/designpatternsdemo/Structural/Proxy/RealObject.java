package com.example.designpatternsdemo.Structural.Proxy;

public class RealObject extends AbstractObject {
    @Override
    void operation() {
        System.out.println("do operation...");
    }
}
