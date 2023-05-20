package oop;
import java.util.*;
public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = keyboard.nextLine();
        
        System.out.println("How old are you?");
        int age = keyboard.nextInt();
        System.out.println("How tall are you?");
        double height = keyboard.nextDouble();
       
        System.out.println("Your name is " + name + ", you are " + age + " years old, and you are " + height + " meters tall.");
    }
}
