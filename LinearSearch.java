package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter values :");
        for(int i=0 ;i<5;i++){
            System.out.println("Enter the value for element "+(i+1));
            array[i]= scanner.nextInt();
        }
        System.out.println("Enter value you want to search in array");
        int searchElement = scanner.nextInt();
        search(array,searchElement);

    }

    private static void search(int [] array,int searchElement) {
        for(int i =0;i<array.length;i++){
            if(array[i]==searchElement){
                System.out.println("Found element at "+(i+1)+" place");
                return;
            }

        }
        System.out.println("Element not found!!");

    }
}
