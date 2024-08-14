package Swapping;

import java.util.Scanner;

public class Swap1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Before Swapping a = " + a + " and b = " + b);
        
        int temp = a;//give data type and logic
        a = b;
        b = temp;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

}