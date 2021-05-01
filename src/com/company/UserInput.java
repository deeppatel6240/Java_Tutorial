package com.company;
import java.util.Scanner;

public class UserInput {

    static void checkInput(){
        Scanner s1 = new Scanner(System.in);

        boolean b = s1.hasNextInt();
        System.out.println(b);
    }

    static void stringInput(){
        Scanner s2 = new Scanner(System.in);

        // String
        String str = s2.nextLine();
        System.out.println(str);

        String str1 = s2.next();
        System.out.println(str1);
    }

    public static void main(String[] args) {
        System.out.println("User Input :");
        Scanner sc = new Scanner(System.in);

        // nextInt
        System.out.println("Enter Number 1");
        int n1 = sc.nextInt();

        System.out.println("Enter Number 2");
        int n2 = sc.nextInt();

        int sum = n1 + n2;
        System.out.println("Sum is: " + sum);

        // nextFloat
        System.out.println("Enter float Number 1");
        float f1 = sc.nextFloat();

        System.out.println("Enter float Number 2");
        float f2 = sc.nextFloat();

        float f_sum = f1 + f2;
        System.out.println("Sum is: " + f_sum);

        // method called
        checkInput();
        stringInput();
    }
}
