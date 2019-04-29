package com.dell.academy.rover;

public class MarsRover {

    // == fields ==
    private Position position;

    // == constructors ==
    public MarsRover() {
        this.position = new Position();
    }

    // == public methods ==
    public Position getPosition() {
        return this.position;
    }

    public void setPosition(int x, int y, CardinalPoint c) {
        position.setX(x);
        position.setY(y);
        position.setCardinalPoint(c);
    }
}
