package oop;
import java.util.*;
public class AddTwoMatrics {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter the size of 2 matrices:");
        String size = keyboard.nextLine();
        String[] sizeArray = size.split(" ");
        int n = Integer.parseInt(sizeArray[0]);
        int m = Integer.parseInt(sizeArray[1]);

        int[][] matrice1 = new int[n][m];
        int[][] matrice2 = new int[n][m];

        System.out.println("Enter the elements of the first matrix:");

        //matrice1
        for (int i = 0; i < n; i++) {
            String row = keyboard.nextLine();
            String[] rowArray = row.split(" ");
            for (int j = 0; j < m; j++) {
                matrice1[i][j] = Integer.parseInt(rowArray[j]);
            }
        }

        //matrice2
        System.out.println("Enter the elements of the second matrix:");
        for (int i = 0; i < n; i++) {
            String row = keyboard.nextLine();
            String[] rowArray = row.split(" ");
            for (int j = 0; j < m; j++) {
                matrice2[i][j] = Integer.parseInt(rowArray[j]);
            } 
        }
        
        System.out.println("The first matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The second matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrice2[i][j] + " ");
            }
            System.out.println();
        }

        //Sum of 2 matrices

        int[][] sum = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum[i][j] = matrice1[i][j] + matrice2[i][j];
            }
        }

        System.out.println("The sum of the 2 matrices is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
