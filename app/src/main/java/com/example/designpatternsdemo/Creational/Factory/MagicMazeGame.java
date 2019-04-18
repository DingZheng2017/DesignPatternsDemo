package com.example.designpatternsdemo.Creational.Factory;

public class MagicMazeGame extends MazeGame {
    @Override
    protected Room makeRoom() {
        return new MagicRoom();
    }
}
