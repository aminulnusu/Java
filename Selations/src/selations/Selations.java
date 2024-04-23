package selations;

import java.util.Scanner;

public class Selations {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int maxNumber;

        System.out.println("first number");
        int firstNumber = scanner.nextInt();
        System.out.println("second number");
        int secondNumber = scanner.nextInt();
        System.out.println("third number");
        int thirdNumber = scanner.nextInt();

        if (firstNumber > secondNumber & firstNumber > thirdNumber) {
            maxNumber = firstNumber;
        } else if (secondNumber > firstNumber & secondNumber > thirdNumber) {
            maxNumber = secondNumber;
        } 
        else {
            maxNumber = thirdNumber;
                    }

        System.out.println("maxNumber");

    }

}
