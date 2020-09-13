package com.company;

import java.util.Random;

public class RandomArmstrong {
    static  void  checkArmstrong(int number){
        int temp = number,rem,result=0;

        while (number>0){
            rem = number%10;
            number = number/10;
            result = result+(rem*rem*rem);

        }
        if(temp == result){
            System.out.println("armstrong number");
        }else {
            System.out.println("Not armstrong number");
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(99-10)+10;
        System.out.println("Random Number is : " +number );
        checkArmstrong(number);

    }
}
