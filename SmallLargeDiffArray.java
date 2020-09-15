package com.company;

import java.util.Scanner;

public class SmallLargeDiffArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("Enter values :");
        for(int i=0 ;i<5;i++){
            System.out.println("Enter the value for element "+(i+1));
            array[i]= scanner.nextInt();
        }
        int[] arraySort = sort(array);
        int smallestNumber = arraySort[0];
        int lagrestNumber = arraySort[arraySort.length-1];

        System.out.println("Diffrence :- "+lagrestNumber +" - "+smallestNumber+" = "+(lagrestNumber-smallestNumber));

    }

    private static int[] sort(int[] array) {
        for (int i = 0; i < array.length-1; i++)
            for (int j = 0; j < array.length-i-1; j++)
                if (array[j] > array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
        return array;
    }

}
