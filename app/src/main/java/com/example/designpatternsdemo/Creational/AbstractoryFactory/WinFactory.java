package com.example.designpatternsdemo.Creational.AbstractoryFactory;

public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }
}
