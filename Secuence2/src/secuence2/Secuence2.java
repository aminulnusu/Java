package secuence2;

import java.util.Scanner;

public class Secuence2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int sum = 0;
        while (true) {

            int number = input.nextInt();

            if (number < 0) {
                break;
            }

            sum += number;
        }
        System.out.println("the total number is " + sum);
    }
}
