
package com.mycompany.switchcase;


import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
       Scanner numberOfDay=new Scanner(System.in);
               
        System.out.println("plz enter the day number");   
        
        
        int numberDay=numberOfDay.nextInt();
        String dayName="";
        
        switch(numberDay){
        
            case 1:
                dayName="saturday";
        break;
            case 2:
                dayName="sunday";
                break;
              
            case 3:
                dayName="Monday";
                break;
              
            case 4:
                dayName="Tusday";
                break;
              
            case 5:
                dayName="Wed";
                break;
            default:
                dayName="invalid number";
            
        }
     
        System.out.println("invalid number"+dayName);
        
          
        
        
    }
}
