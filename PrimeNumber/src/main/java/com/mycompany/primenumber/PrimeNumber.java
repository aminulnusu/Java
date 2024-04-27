
package com.mycompany.primenumber;

import java.util.Scanner;


public class PrimeNumber {

    public static void main(String[] args) {
        
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("Enter the number");
        int userInput=scanner.nextInt();
        int count = 0;
        
        for(int i=1;i<=userInput;i++){
            if(userInput%i==0){
              count+=1;  
            }
            
        }
       
        if(count==2){
            System.out.println("this is prime number");
        }
        
        else{
            System.out.println("this is not prime number");
        }
            
        
    }
}
