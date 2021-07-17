import java.util.*;
public class Matrix {
     public static void main(String[] args) {
          int[][] a, b, c;
          int size_row, size_col, i , j;
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter the row size: ");
          size_row = scan.nextInt();
          System.out.println("Enter the col size: ");
          size_col = scan.nextInt();
          a = new int[size_row][size_col];
          b = new int[size_row][size_col];
          c = new int[size_row][size_col];

          System.out.println("Enter the elements of the 1st array: ");
          for(i=0; i<size_row; i++){
               for(j=0; j<size_col; j++){
                    a[i][j]=scan.nextInt();
               }
          }
          System.out.println("Enter the elements of the 2nd array: ");
          for(i=0; i<size_row; i++){
               for(j=0; j<size_col; j++){
                    b[i][j]=scan.nextInt();
               }
          }
          for (i=0; i<size_row;i++){
               for(j=0; j<size_col; j++){
                    c[i][j] = a[i][j] + b[i][j];
               }
          }
          for(i=0; i<size_row; i++){
               for(j=0; j<size_col; j++){
                    System.out.print(a[i][j]+"\t");
               }
               System.out.println("\n");
          }
          System.out.println("+");
          for(i=0; i<size_row; i++){
               for(j=0; j<size_col; j++){
                    System.out.print(a[i][j]+"\t");
               }
               System.out.println("\n");
          }
          System.out.println("=");
          for(i=0; i<size_row; i++){
               for(j=0; j<size_col; j++){
                    System.out.print(c[i][j]+"\t");
               }
               System.out.println("\n");
          }
     }
}

