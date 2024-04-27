
package com.mycompany.testgussenumber;

import java.util.Scanner;


public class TestGusseNumber {

    public static void main(String[] args) {
   
        int number=(int)(Math.random()*101);
        
        Scanner input=new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");
        
        System.out.println("\nEnter the guess:");
        int guess=input.nextInt();
        
        if(guess==number){
            System.out.println("Yes the number is "+number);
        
        }
        else if (guess>number){
            System.out.println("Your guess number is high");
        }
        else{
            System.out.println("Your guess number is too low");
        }
        
        
        
        
        
        
    }
}
