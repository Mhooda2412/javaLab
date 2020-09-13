package com.company;

import java.util.Random;

public class RandomPrime {
    static Boolean checkPrime(int number){
        Boolean flag = false;
        for(int i =2 ; i<=Math.sqrt(number);i++){
            if(number%i==0){
                flag = true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt();
        System.out.println("Random Number is : " +number );
        if(number>1){
            if(checkPrime(number)){
                System.out.println("Number is not prime!");
            }else {
                System.out.println("Number is prime!");
            }
        }else {
            System.out.println("Error! Invalid number");
        }
    }
}
