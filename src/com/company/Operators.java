package com.company;
import java.util.Scanner;

public class Operators {

    static void operators(){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the values :");
        float n1 = s.nextFloat();

        System.out.println("Enter the sec values :");
        float n2 = s.nextFloat();

        //arithmetic operators

        float add = n1 + n2;
        System.out.println("add is :" + add);

        float subtract = n1 - n2;
        System.out.println("subtraction is :" + subtract);

        float mul = n1 * n2;
        System.out.println("multiply is :" + mul);

        float div = n1 / n2;
        System.out.println("division is :" + div);

        float remi = n1 % n2;
        System.out.println("reminder is :" + remi);

        float incre = n1++;
        System.out.println("post increment is :" + incre);

        float decre = n2--;
        System.out.println("post decrement is :" + decre);

        float pre_i = 30;
        System.out.println("pre increment is :" + ++pre_i);

        float pre_d = 20;
        System.out.println("pre decrement is :" + --pre_d);

        //assignment operators

        float a = 12;
        a += 20;
        System.out.println("value is :" + a);

        float b = 32;
        b -= 20;
        System.out.println("value is :" + b);

        //comparison operators

        System.out.println("enter integer value :");
        int n3 = s.nextInt();

        System.out.println("enter integer value 2 :");
        int n4 = s.nextInt();

        System.out.println(n3 == n4);
        System.out.println(n3 != n4);
        System.out.println(n3 > n4);
        System.out.println(n3 < n4);
        System.out.println(n3 >= n4);
        System.out.println(n3 <= n4);
        System.out.println(n3 & n4);
        System.out.println(n3 | n4);

        //logical operators

        System.out.println(n3 < 12 && n4 < 14);
        System.out.println(n3 <= 13 || n4 > 14);
        System.out.println(!(n3 < 12 && n4 < 14));
    }

    public static void main(String[] args) {
         operators();
    }
}
