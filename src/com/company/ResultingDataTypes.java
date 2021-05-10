package com.company;

import java.sql.SQLOutput;

public class ResultingDataTypes {
    public static void main(String[] args) {
        byte r = 120;
        short s = 12344;

        System.out.println(r+s);
        System.out.println(((Object)(r+s)).getClass().getSimpleName());
        /*
            //for primitive data types
            ((Object)(r+s)).getClass().getSimpleName()

            //for non primitive data types
            str.getClass().getSimpleName()
        */
        String str = "deep";
        System.out.println(str.getClass().getSimpleName());

        char ch = 'd';
        System.out.println(((Object)ch).getClass().getSimpleName());

        char x = 'B';
        System.out.println(x++);
        System.out.println(x);



    }
}
