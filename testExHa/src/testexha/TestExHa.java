package testexha;

import java.util.Scanner;

public class TestExHa {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");
        int number1 = scanner.nextInt();
        System.out.println("Enter the first number");
        int number2 = scanner.nextInt();

        try {
            System.out.println("Result" + number1 / number2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
