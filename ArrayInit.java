package com.company;

import java.util.Scanner;

public class ArrayInit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[4];
        System.out.println("Enter values :");
        for(int i=0 ;i<4;i++){
            System.out.println("Enter the value for element "+(i+1));
            array[i]= scanner.nextInt();
        }
        System.out.println("Printing values of array : - ");
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+(i+1)+" "+array[i]);
        }
    }

}
