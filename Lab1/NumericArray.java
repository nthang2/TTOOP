package oop;
import java.util.*;
public class NumericArray {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter length of array;");
        int length = keyboard.nextInt();
        int[] NumericArray = new int[length];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < length ; i++) {
            NumericArray[i] = keyboard.nextInt();
        }

        System.out.println("The array is:" + Arrays.toString(NumericArray));

        //Sum
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += NumericArray[i];
        }
        System.out.println("The sum of the array is: " + sum);
        System.out.println("The average of the array is: " + sum/length);
        
        //sort
        Arrays.sort(NumericArray);
        System.out.println("The sorted array is: " + Arrays.toString(NumericArray));
    }
}
