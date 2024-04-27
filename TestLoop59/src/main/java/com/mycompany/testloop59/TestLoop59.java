
package com.mycompany.testloop59;

import java.util.Scanner;


public class TestLoop59 {

    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the start point value");
        int stratPoint=s.nextInt();
        System.out.println("Enter the end point value");
        int endpoint=s.nextInt();
        
       while(stratPoint<=endpoint){
       if(stratPoint%3==0||stratPoint%5==0){
           System.out.println(stratPoint+" enter number ");
           
           
       }
       else{
           System.out.println(  endpoint+ " end number");
       }
       
       
       }
        
        
        
        
    }
}
