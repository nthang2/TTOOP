package oop;
import java.util.*;
public class Triangle {
    public static void main(String[] args){
        Scanner triangle = new Scanner(System.in);

        System.out.println("The high of the triangle is: ");
        
        int n = triangle.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            
            for (int j = 1; j <= 2*(i-1)+1; j++) {
                System.out.print("*");
                
            }
            System.out.print("\n");
        }

    }
    
}
