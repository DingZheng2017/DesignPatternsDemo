package com.example.designpatternsdemo.Creational.PhotoType;

public interface Product extends Cloneable{
     void use(String word);
     Product createClone();
}
