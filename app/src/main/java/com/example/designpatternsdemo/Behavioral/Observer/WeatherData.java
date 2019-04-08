package com.example.designpatternsdemo.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public  WeatherData(){
        observers=new ArrayList<Observer>();
    }
    public void registerObServer(Observer o) {//注册观察者
        observers.add(o);
    }
    @Override
    public void removeObServer(Observer o) {//删除观察者
        observers.remove(o);
    }
    @Override
    public void notifyObservers() {
        for(Observer ob:observers){
            ob.update();
        }
    }

    public void measuermentsChanged(){
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public float getHumidity() {
        return humidity;
    }
    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }
    public float getPressure() {
        return pressure;
    }
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }
}
