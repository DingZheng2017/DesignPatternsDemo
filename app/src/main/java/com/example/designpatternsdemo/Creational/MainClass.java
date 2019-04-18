package com.example.designpatternsdemo.Creational;

import com.example.designpatternsdemo.Creational.AbstractoryFactory.Button;
import com.example.designpatternsdemo.Creational.AbstractoryFactory.GUIFactory;
import com.example.designpatternsdemo.Creational.AbstractoryFactory.OSXFactory;
import com.example.designpatternsdemo.Creational.AbstractoryFactory.WinFactory;
import com.example.designpatternsdemo.Creational.Builder.Director;
import com.example.designpatternsdemo.Creational.Builder.HtmlBuilder;
import com.example.designpatternsdemo.Creational.Builder.TextBuilder;
import com.example.designpatternsdemo.Creational.Factory.MagicMazeGame;
import com.example.designpatternsdemo.Creational.Factory.MazeGame;
import com.example.designpatternsdemo.Creational.Factory.OrdinaryMazeGame;
import com.example.designpatternsdemo.Creational.PhotoType.MessageBox;
import com.example.designpatternsdemo.Creational.PhotoType.Product;

public class MainClass {

    //Factory

    public void testFactory() {
        MazeGame ordinaryGame = new OrdinaryMazeGame();
        MazeGame magicGame = new MagicMazeGame();
    }

    //AbstractFactory
    public void testAbstratcoryFactory(int type) {
        GUIFactory factory = null;
        switch (type) {
            case 0:
                factory = new WinFactory();
                break;
            case 1:
                factory = new OSXFactory();
                break;
        }

        Button button = factory.createButton();
        button.paint();
    }

    //Builder
    public void useBuilder(String choice) {
        if (choice.equals("plain")) {
            TextBuilder t = new TextBuilder();
            Director d = new Director(t);
            d.construct();
            System.out.println(t.getResult());
        } else if (choice.endsWith("html")) {
            HtmlBuilder html = new HtmlBuilder();
            Director d = new Director(html);
            d.construct();
            System.out.println(html.getResult());
        }
    }

    //PhotoType
    public void testPhotoType() {
        Product a = new MessageBox('a');
        Product b = a.createClone();
    }
}
