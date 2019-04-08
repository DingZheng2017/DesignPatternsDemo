package com.example.designpatternsdemo.Creational.Factory;

import com.example.designpatternsdemo.model.Sample;
import com.example.designpatternsdemo.model.SampleA;
import com.example.designpatternsdemo.model.SampleB;

public class Factory {
    public static Sample creator(int which) {
        switch (which) {
            case 1:
                return new SampleA();
            case 2:
                return new SampleB();
        }
        return null;
    }
}
