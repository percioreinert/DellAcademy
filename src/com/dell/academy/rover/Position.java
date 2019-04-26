package com.dell.academy.rover;

public class Position {

    // == fields ==
    private int x;
    private int y;

    // == constructors ==
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // == public methods ==
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
