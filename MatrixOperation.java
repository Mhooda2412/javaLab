package com.company;

import java.util.Scanner;

class Matrix{
    int raw;
    int column;
    int [][] Array2D;

    public Matrix(int rows, int column) {
        this.raw = rows;
        this.column = column;
        this.Array2D = new int[this.raw][this.column];
    }

    public void setMatrix(){
        Scanner scanner = new Scanner(System.in);
        for(int i= 0 ;i<this.raw;i++){
            for(int j=0 ;j<this.column;j++){
                Array2D[i][j] = scanner.nextInt();
            }
        }
    }
    public  void displayMatrix(){
        for(int i= 0 ;i<this.raw;i++){
            for(int j=0 ;j<this.column;j++){
                System.out.print(Array2D[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public int[][] getArray2D() {
        return Array2D;
    }

    public int getRaw() {
        return raw;
    }

    public int getColumn() {
        return column;
    }

}

public class MatrixOperation {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
    System.out.println("Select the operation\n");
    System.out.println("1:-- Addition of two matrix");
    System.out.println("2:-- Multiplication of two matrix");
    int choice = scanner.nextInt();
    switch (choice){
        case 1: addition();
        break;
        case 2: multiplication();
        break;
        default:System.out.println("Invalid choice!! ");
    }

    }

    private static void multiplication() {
        System.out.println("Enter the no rows of matrix 1");
        int rowsMatrix1 = scanner.nextInt();
        System.out.println("Enter the no of columns 1 ");
        int columnMatrix1 = scanner.nextInt();
        Matrix matrix1 = new Matrix(rowsMatrix1,columnMatrix1);
        System.out.println("Enter the element of matrix 1");
        matrix1.setMatrix();
        Matrix matrix2;
        boolean flag = true;
        do{
                System.out.println("Enter the no rows of matrix 2");
                int rowsMatrix2 = scanner.nextInt();
                System.out.println("Enter the no of columns 2 ");
                int columnMatrix2 = scanner.nextInt();
                matrix2 = new Matrix(rowsMatrix2,columnMatrix2);
                if(matrix1.getColumn() == matrix2.getRaw()){
                    flag=false;
                }else {
                    System.out.println("Invalid Rows and columns!! Multiplication is not possible!!\nTry again");
                }
        }while (flag);
        System.out.println("Enter the element of matrix 2");
        matrix2.setMatrix();
        System.out.println("Multiplication of two matrices");
        Matrix multMatrix = new Matrix(matrix1.getRaw(),matrix2.getColumn());
        for(int i=0;i<matrix1.getRaw();i++){
            for(int j=0;j<matrix2.getColumn();j++){
                multMatrix.getArray2D()[i][j] = 0;
                for(int k = 0;k<matrix1.getColumn();k++){
                    multMatrix.getArray2D()[i][j]+=matrix1.getArray2D()[i][k]*matrix2.getArray2D()[k][j];
                }
            }
        }
        multMatrix.displayMatrix();

    }

    private static void addition() {
        System.out.println("Enter the no rows of matrix");
        int rows = scanner.nextInt();
        System.out.println("Enter the no of columns");
        int column = scanner.nextInt();
        Matrix matrix1 = new Matrix(rows,column);
        Matrix matrix2 = new Matrix(rows,column);
        System.out.println("Enter the element of matrix 1");
        matrix1.setMatrix();
        System.out.println("Enter the element of matrix 2");
        matrix2.setMatrix();
        Matrix sumMatrix = new Matrix(rows,column);
        for(int i = 0; i<rows;i++){
            for (int j =0 ;j<column;j++){
                 sumMatrix.getArray2D()[i][j] = matrix1.getArray2D()[i][j]+matrix2.getArray2D()[i][j];
            }
        }
        System.out.println("Sum of two matrix");
        sumMatrix.displayMatrix();

    }
}
