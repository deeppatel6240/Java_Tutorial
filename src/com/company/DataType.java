package com.company;

public class DataType {
    public static void main(String...args){
        byte Void = 127;
        System.out.println(Void);

    }
}

/*
    formula for finding range for particular data types:
        if we take int then
            it takes 4 bytes so range is = -((2)^32 / 2) to ((2^32 / 2) - 1)

            formula = -(2^8n / 2) to ((2^8n / 2) - 1)
*/