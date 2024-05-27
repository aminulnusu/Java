package testprimenumber1;

import java.util.Scanner;

public class TestPrimeNumber1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter the  number");
        int number = input.nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("it is prime number");
        } else {
            System.out.println("it is not prime number");
        }

    }
}
