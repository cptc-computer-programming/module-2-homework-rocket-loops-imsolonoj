/*
 * Name: Jaelen Gill
 * Program: RocketShip.java
 * Purpose: Prints a scalable rocket ship using loops and ROCKET_SIZE.
 */

public class RocketShip {

    public static final int ROCKET_SIZE = 3;

    public static void main(String[] args) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    public static void printNozzle() {
        printNoseCone();
    }

    public static void printNoseCone() {
        for (int line = 1; line <= ROCKET_SIZE * 2 - 1; line++) {

            for (int space = 1; space <= ROCKET_SIZE * 2 - line; space++) {
                System.out.print(" ");
            }

            for (int slash = 1; slash <= line; slash++) {
                System.out.print("/");
            }

            System.out.print("**");

            for (int backslash = 1; backslash <= line; backslash++) {
                System.out.print("\\");
            }

            System.out.println();
        }
    }

    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
        printDiamondBottom();
        printDiamondTop();
        printEdge();
    }

    public static void printDiamondTop() {
        for (int line = 1; line <= ROCKET_SIZE; line++) {

            System.out.print("|");

            for (int dot = 1; dot <= ROCKET_SIZE - line; dot++) {
                System.out.print(".");
            }

            for (int pattern = 1; pattern <= line; pattern++) {
                System.out.print("/\\");
            }

            for (int dot = 1; dot <= 2 * (ROCKET_SIZE - line); dot++) {
                System.out.print(".");
            }

            for (int pattern = 1; pattern <= line; pattern++) {
                System.out.print("/\\");
            }

            for (int dot = 1; dot <= ROCKET_SIZE - line; dot++) {
                System.out.print(".");
            }

            System.out.println("|");
        }
    }

    public static void printDiamondBottom() {
        for (int line = ROCKET_SIZE; line >= 1; line--) {

            System.out.print("|");

            for (int dot = 1; dot <= ROCKET_SIZE - line; dot++) {
                System.out.print(".");
            }

            for (int pattern = 1; pattern <= line; pattern++) {
                System.out.print("\\/");
            }

            for (int dot = 1; dot <= 2 * (ROCKET_SIZE - line); dot++) {
                System.out.print(".");
            }

            for (int pattern = 1; pattern <= line; pattern++) {
                System.out.print("\\/");
            }

            for (int dot = 1; dot <= ROCKET_SIZE - line; dot++) {
                System.out.print(".");
            }

            System.out.println("|");
        }
    }

    public static void printEdge() {
        System.out.print("+");

        for (int i = 1; i <= ROCKET_SIZE * 2; i++) {
            System.out.print("=*");
        }

        System.out.println("+");
    }
}
