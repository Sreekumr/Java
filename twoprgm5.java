import java.io.*;

class twoprgm5
 {
    public static void main(String args[])
     {
        System.out.println("Sreekumar");
        DataInputStream din;
        din = new DataInputStream(System.in);
        int rows, cols, rowSum, colSum, i, j;
        int a[][];
        a = new int[10][10];
        try {
  
            System.out.println("\nEnter the number of rows: ");
            rows = Integer.parseInt(din.readLine());
            System.out.println("\nEnter the number of columns: ");
            cols = Integer.parseInt(din.readLine());
            for (i = 0; i < rows; i++) {
                System.out.println("\nEnter values of row " + (i + 1));
                for (j = 0; j < cols; j++) {
                    a[i][j] = Integer.parseInt(din.readLine());
                }
            }
 
            for (i = 0; i < rows; i++) {
                rowSum = 0;
                for (j = 0; j < cols; j++) {
                    rowSum = rowSum + a[i][j];
                    System.out.print("\t" + a[i][j]);
                }
                System.out.println(" | " + rowSum);
            }


            for (i = 0; i < cols; i++) {
                colSum = 0;
                System.out.print("--------");
            }
            System.out.println();
            for (i = 0; i < cols; i++) {
                colSum = 0;
                for (j = 0; j < rows; j++) {
                    colSum = colSum + a[j][i];
                    System.out.print("\t" + a[j][i]);
                }
                System.out.print(" | " + colSum);
                System.out.println();
            }
        } 
catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
