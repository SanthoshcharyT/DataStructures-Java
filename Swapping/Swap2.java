package Swapping;

import java.util.Scanner;

public class Swap2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Before Swapping a = " + a + " and b = " + b);
        a = a + b;//here a=a+b ex: suppose you have given a = a + b that means assigned a value a = 5 and b = 3 and that two are stored in a = 8
        b = a - b;//here logic applied now b = a - b that means b remains 3 and and a value is now 8 then the b = a - b value is b = 8 - 3 is equal to 5 
        a = a - b;//here b = 5 and a = 8 - 5 and it is equal to a = 3
//now a = a + b = 5 + 3 = 8
//b = a - b = 8 - 3 = 5
//a = a - b = 8 - 5 = 3
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}