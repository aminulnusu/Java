package testarray1;

import java.util.Scanner;

public class TestArray1 {

    public static void main(String[] args) {

        System.out.println("enter thenumber");
        Scanner input = new Scanner(System.in);
        
        int total=0;
        while (true) {
            
            

            int number = input.nextInt();

            if (number < 0) {
                break;
            }
            
            total+=number;
        }
        System.out.println("the total number is "+total);
    }

    }



