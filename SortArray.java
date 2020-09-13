package com.company;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int array[] = new int[size];
        System.out.println("Enter values :");
        for(int i=0 ;i<size;i++){
            System.out.println("Enter the value for element "+(i+1));
            array[i]= scanner.nextInt();
        }
        System.out.println("Select \n 1: Sort in ascending order \n 2: Sort in descending order ");
        int choice = scanner.nextInt();
        switch (choice){
            case 1: shortAscending(array);
            break;
            case 2: shortDescending(array);
            break;
            default:System.out.println("Invalid choice!!");

        }
    }

    private static void shortDescending(int[] array) {

        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] < array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        System.out.println("Array after sorting : \n");
        System.out.println("Printing values of array : - ");
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+(i+1)+" "+array[i]);
        }

    }

    private static void shortAscending(int[] array) {
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        System.out.println("Array after sorting : \n");
        System.out.println("Printing values of array : - ");
        for(int i=0;i<array.length;i++){
            System.out.println("Element "+(i+1)+" "+array[i]);
        }
    }
}
