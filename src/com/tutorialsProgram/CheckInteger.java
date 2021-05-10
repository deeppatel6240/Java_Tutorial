package com.tutorialsProgram;
import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the values :");
        boolean a = s.hasNextInt();
        System.out.println(a);
    }
}
