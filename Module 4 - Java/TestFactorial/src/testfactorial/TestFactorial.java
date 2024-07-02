package testfactorial;

import java.util.Scanner;

public class TestFactorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = s.nextInt();
        int fact = 1;
        for (int i = number; i >= 1; i--) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }

}
