package com.dell.academy.rover;

public class Position {

    // == fields ==
    private int x;
    private int y;
    private CardinalPoint cardinalPoint;

    // ==constructors ==
    public Position() {
        this.x = 0;
        this.y = 0;
        cardinalPoint = CardinalPoint.E;
    }

    // == public methods ==
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public CardinalPoint getCardinalPoint() {
        return cardinalPoint;
    }

    public void setCardinalPoint(CardinalPoint cardinalPoint) {
        this.cardinalPoint = cardinalPoint;
    }
}
