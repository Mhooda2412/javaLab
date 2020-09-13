package com.company;

public class CommandArgs {
    public static void main(String[] args) {
        int sum= 0;
        for(int i =0 ; i<args.length;i++){
            try {
                sum = sum + Integer.parseInt(args[i]) ;

            }catch (Exception e){
                System.out.println("Error! enter valid numbers");
                return;
            }
        }
        System.out.println("Sum: " + sum);
    }
}
