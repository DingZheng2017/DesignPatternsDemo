package com.example.designpatternsdemo.Creational.AbstractoryFactory;

import com.example.designpatternsdemo.model.Sample;
import com.example.designpatternsdemo.model.SampleA;

public abstract class AbstractFactory {

    public abstract Sample creator();
    public abstract SampleA creator(String name);
}

