package com.company;
import java.util.Scanner;

public class GTUCalculator {

    static void gtuCal(){
        Scanner sc = new Scanner(System.in);

        //one
        System.out.println("Enter the name of Student one");
        String s_name = sc.nextLine();

        System.out.println("Maths marks is :");
        byte maths = sc.nextByte();

        System.out.println("sci marks is :");
        byte sci = sc.nextByte();

        System.out.println("python marks is :");
        byte python = sc.nextByte();

        System.out.println("java marks is :");
        byte java = sc.nextByte();

        System.out.println("ml marks is :");
        byte ml = sc.nextByte();

        int percentage = (maths + sci + python + java + ml) / 5;
        if (percentage <= 100) {
            System.out.println("Percentage of all subjects is : " + percentage);
        }
        else{
            System.out.println("wrong");
        }
    }

    public static void main(String[] args) {
        gtuCal();
    }
}
