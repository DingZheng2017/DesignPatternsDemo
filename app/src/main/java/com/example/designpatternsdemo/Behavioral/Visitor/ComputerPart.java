package com.example.designpatternsdemo.Behavioral.Visitor;

public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
