package com.company;

public class CommandArgsArray {
    public static void main(String[] args) {
        int array[] = new int[args.length];
        try {
            for (int i=0 ;i<args.length;i++){
                array[i] = Integer.parseInt(args[i]);
            }
        }catch (Exception e){
            System.out.println("Error! enter valid numbers");
            return;
        }

        for (int element:array) {
            System.out.println(element);
        }
        
    }
}
