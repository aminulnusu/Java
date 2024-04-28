
package com.mycompany.testbreakcontinue;
import java.util.Scanner;

public class TestBreakContinue {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int sum=0;
        
        while(true){
            System.out.println("enter the value");
            int userInput=s.nextInt();
            sum+=userInput;
            
            if(sum>=200){
               
            }
            else if(sum>=100){
                continue;
            }
         
            System.out.println("sum is "+sum);
        }
        
    }
}
