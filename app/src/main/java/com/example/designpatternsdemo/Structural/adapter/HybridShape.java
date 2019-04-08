package com.example.designpatternsdemo.Structural.adapter;

public class HybridShape implements ICircle,ISquare{
    private ISquare square;
    private ICircle circle;
    public HybridShape(Square square){
        this.square = square;
    }
    public HybridShape(Circle circle){
        this.circle = circle;
    }
    public void drawSquare(){
        square.drawSquare();
    }
    public void drawCircle(){
        circle.drawCircle();
    }
}
