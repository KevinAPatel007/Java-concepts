package array;

import java.util.Arrays;

public class doubledimensionArray {
    public static void main(String[] args) {
        int a[][]= new int[3][2];

       /*  a[0][0]=100;
         a[0][1]=200;

         a[1][0]=300;
         a[1][2]=400;

         a[2][1]=500;
         a[2][2]=600;*/

         int b[][]= {{100,200},{300,400},{500,600}};

        System.out.println("rows"+b.length);
        System.out.println("colums"+b[0].length);

     for (int i=0;i<b.length;i++){
         for (int j=0;j<b[i].length;j++){
             System.out.print(b[i][j]+"   ");
         }
         System.out.println();

     }
    }}

