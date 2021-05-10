package com.tutorialsProgram;
import java.util.Scanner;


public class UserInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the name : ");
        String str = s.nextLine();
        System.out.println("Hello " + str + ", How are YOu?");
    }
}
