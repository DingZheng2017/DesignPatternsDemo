package com.example.designpatternsdemo.Creational.AbstractoryFactory;

public class OSXFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
