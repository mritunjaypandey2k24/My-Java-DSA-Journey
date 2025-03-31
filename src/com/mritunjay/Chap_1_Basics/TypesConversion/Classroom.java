package com.mritunjay.Chap_1_Basics.TypesConversion;

public class Classroom{
    public static void main(String [] args){

        //Type Casting // Narrow Conversion//Explicit conversion
        float a = 25.99f;
        int b = (int) a;
        System.out.println(b);

        char ch = 'a';
        b = (int) ch;
        System.out.println(b);

        //Type Promotion in expression

        char ch1 = 'a';
        char ch2 = 'b';
        System.out.println(ch2-ch1);

        //Automatic conversion
        float num1=56.7f;
        double num2 = 56.775;
        int num3 = 56;
        long num4 = 9595;

        System.out.println( num1+num2+num3+num4); //converts to double



    }
}