package com.dell.academy.rover;

public class MarsRover {

    // == fields ==
    private int x;
    private int y;
    private Movement movement;
    // TODO: finish the implementation.

    // == constructors ==
    public MarsRover(int x, int y) {
        this.x = x;
        this.y = y;
        movement = Movement.M;
    }

    // == public methods ==
    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public Movement getMovement() {
        return this.movement;
    }
}
