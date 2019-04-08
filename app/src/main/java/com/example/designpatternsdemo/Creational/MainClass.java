package com.example.designpatternsdemo.Creational;

import com.example.designpatternsdemo.Creational.AbstractoryFactory.BombFactory;
import com.example.designpatternsdemo.Creational.AbstractoryFactory.SimpleFactory;
import com.example.designpatternsdemo.Creational.Builder.Director;
import com.example.designpatternsdemo.Creational.Builder.HtmlBuilder;
import com.example.designpatternsdemo.Creational.Builder.TextBuilder;
import com.example.designpatternsdemo.Creational.Factory.Factory;
import com.example.designpatternsdemo.Creational.PhotoType.MessageBox;
import com.example.designpatternsdemo.Creational.PhotoType.Product;
import com.example.designpatternsdemo.model.Sample;

import java.util.HashMap;

public class MainClass {

    //Factory
    Sample sampleA = Factory.creator(1);

    //AbstractFactory

    Sample sample1 = new SimpleFactory().creator();
    Sample sample2 = new BombFactory().creator("2");

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
    Product a = new MessageBox('a');
    Product b = a.createClone();

}
