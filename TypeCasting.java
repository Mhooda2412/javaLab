package com.company;

/*
* Program based on type casting & conversions.
* */

public class TypeCasting {
    public static void main(String[] args) {
        /*
        * Automatic casting: int to double
        * */
        int intData = 9;
        double doubleData = intData;
        System.out.println("Automatic Type Casting: \n" +doubleData);

        /*
        * Manual casting: double to int
        * */

        doubleData = 9.78;
        intData = (int) doubleData;
        System.out.println("Manual Type Casting: \n" +intData);
    }
}
