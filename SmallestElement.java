package com.company;

import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter values :");
        for(int i=0 ;i<5;i++){
            System.out.println("Enter the value for element "+(i+1));
            array[i]= scanner.nextInt();
        }
        int min = array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min = array[i];
            }
        }
        System.out.println("Smallest element is :- " +min);
    }
}
