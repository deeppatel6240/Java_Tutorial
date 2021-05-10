package com.company;

public class Operators_2 {
    public static void main(String[] args) {
        int a1 = 12*5-100/20;
        /*
            go to the type precedence and associativity image in java folder to understand highest priority for operators
        */
        System.out.println(a1);

        int b1 = 120/12+32*2;
        /*
            highest priority goes to * and /
            associativity is left to right
        */

        // = 10 + 32*2
        // = 10 + 64
        // = 74
        System.out.println(b1);

        // quick quiz
        int x, y;
        x = 12;
        y = 6;
        System.out.println((x - y) / 2);

        int c = 4;
        int a = 5;
        int b = 1;
        System.out.println(( (b*b) - 4 * a * c) / (2 * a));

        int v = 4;
        int u = 2;
        System.out.println((v*v) - (u*u));

        int d = 4;
        System.out.println(a * b - d);




    }
}
