package com.dell.academy.rover;

import java.util.Scanner;

public class AppRover {

    private static Scanner scanner = new Scanner(System.in);
    private static MarsRover rover = new MarsRover();

    public static void main(String[] args) {

        // TODO: Implement.
        int option = 0;
        do {
            System.out.println("== MENU ==");
            System.out.println("\n1 - Girar 90º para a esquerda.");
            System.out.println("\n2 - Girar 90º para a direita.");
            System.out.println("\n3 - Andar para frente.");
            System.out.println("\n0 - Sair.");
            option = scanner.nextInt();
        } while (option < 0 || option > 3);

        switch (option) {
            case 1: left();
                break;
            case 2: right();
                break;
            case 3: if (!move()) {
                        System.out.println("Não foi possível se movimentar.");
                    } else {
                        // TODO: List the matrix.
                    }
                break;
            case 0: System.exit(0);
                break;
        }
    }

    private static void left() {
        if (rover.getPosition().getCardinalPoint() == CardinalPoint.E) {
            rover.getPosition().setCardinalPoint(CardinalPoint.S);
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.S) {
            rover.getPosition().setCardinalPoint(CardinalPoint.W);
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.W) {
            rover.getPosition().setCardinalPoint(CardinalPoint.N);
        } else {
            rover.getPosition().setCardinalPoint(CardinalPoint.E);
        }
    }

    private static void right() {
        if (rover.getPosition().getCardinalPoint() == CardinalPoint.E) {
            rover.getPosition().setCardinalPoint(CardinalPoint.N);
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.N) {
            rover.getPosition().setCardinalPoint(CardinalPoint.W);
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.W) {
            rover.getPosition().setCardinalPoint(CardinalPoint.S);
        } else {
            rover.getPosition().setCardinalPoint(CardinalPoint.E);
        }
    }

    private static boolean move() {
        if (rover.getPosition().getCardinalPoint() == CardinalPoint.E) {
            rover.setPosition(rover.getPosition().getX() - 1, rover.getPosition().getY(), CardinalPoint.E);
            return true;
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.S) {
            rover.setPosition(rover.getPosition().getX(), rover.getPosition().getY() - 1, CardinalPoint.S);
            return true;
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.W) {
            rover.setPosition(rover.getPosition().getX() + 1, rover.getPosition().getY(), CardinalPoint.W);
            return true;
        } else if (rover.getPosition().getCardinalPoint() == CardinalPoint.N) {
            rover.setPosition(rover.getPosition().getX(), rover.getPosition().getY() + 1, CardinalPoint.N);
            return true;
        }
        return false;
    }
}
