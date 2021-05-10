package com.tutorialsProgram;
import java.util.Scanner;

public class KiloToMiles {
    public static void main(String[] args) {
        final float value = 0.621371f;

        Scanner s = new Scanner(System.in);
        System.out.println("enter the value of kilometers :");

        float miles = s.nextFloat();
        float kToM = value * miles;
        System.out.println("Miles value of kilometers : " + kToM);

    }
}
