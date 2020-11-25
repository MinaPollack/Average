package edu.bi.chapfour;

import java.util.*;

public class Average {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        giveIntro();

        System.out.print("a = ");
        double a = console.nextDouble();
        System.out.print("b = ");
        double b = console.nextDouble();
        System.out.print((a + b) / 2);
    }

    public static void giveIntro() {

        System.out.println("This program finds\nthe average of two numbers.");
    }
}
