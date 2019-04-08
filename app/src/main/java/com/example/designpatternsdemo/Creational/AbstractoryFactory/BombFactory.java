package com.example.designpatternsdemo.Creational.AbstractoryFactory;

import com.example.designpatternsdemo.model.Sample;
import com.example.designpatternsdemo.model.SampleA;

public class BombFactory extends AbstractFactory {
    @Override
    public Sample creator() {
        return null;
    }

    @Override
    public SampleA creator(String name) {
        return null;
    }
}
