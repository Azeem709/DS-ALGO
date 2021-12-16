package misc;

import java.util.Scanner;

public class Matrices {

    public static void printMat(int[][] mat,int m,int n){

       for(int row=0;row<m;row++){

           for(int col=0;col<n;col++){

               System.out.print(mat[row][col] +" ");
           }
           System.out.println();
       }
    }


private static void fillArray(int[][] mat,Scanner scanner,int m,int n){

    for(int row=0;row<m;row++){

        for(int col=0;col<n;col++){

            mat[row][col] = scanner.nextInt();
        }
        System.out.println();
    }
}

static void printColumns(int[][] mat,int m,int n){

    for(int row=0;row<m;row++){

        for(int col=0;col<n;col++){

//            System.out.print(mat[col][row] +" ");
        }
        System.out.print(mat[row][row] +" ");
        System.out.println();
    }
}
    public static void main(String ar[]){

        int row = 3;
        int cols = 3;

        int[][] arr = new int[row][cols];
        Scanner scanner  = new Scanner(System.in);

  fillArray(arr,scanner,row,cols);
        printMat(arr,3,3);
        System.out.println("printing columns");
        printColumns(arr,3,3);
    }
}

