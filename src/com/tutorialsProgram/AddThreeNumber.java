package com.tutorialsProgram;
import java.util.Scanner;

public class AddThreeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the first number :");
        float n1 = s.nextFloat();

        System.out.println("Enter the sec number :");
        float n2 = s.nextFloat();

        System.out.println("Enter the third number :");
        float n3 =s.nextFloat();


        float sum = n1 + n2 + n3;

        System.out.println("The sum is : " + sum);
    }
}
