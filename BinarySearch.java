package com.company;

import java.util.Scanner;

public class BinarySearch {
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

    private static void search(int[] array, int searchElement) {
        int low=0,high = array.length;
        while (low<=high){
            int mid = (low+high)/2;
            if(array[mid]<searchElement){
                low=mid+1;
            }else if(array[mid]>searchElement){
                high = mid-1;
            }else if (array[mid]==searchElement){
                System.out.println("Found element at "+(mid+1)+" place");
                break;
            }
        }

    }
}
