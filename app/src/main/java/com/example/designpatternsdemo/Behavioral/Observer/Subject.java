package com.example.designpatternsdemo.Behavioral.Observer;

public interface Subject {
     void registerObServer(Observer o);
     void removeObServer(Observer o);
     void notifyObservers();
}
