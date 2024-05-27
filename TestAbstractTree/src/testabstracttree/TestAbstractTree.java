package testabstracttree;

import java.util.Scanner;

public class TestAbstractTree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        
        int number1=scanner.nextInt();
        int number2=scanner.nextInt();

        int result = 0;

   try {
        result=number1/number2;    
        }
catch (Exception e) {
    
    e.printStackTrace();
        }
        System.out.println(result);
        
    }

    }


