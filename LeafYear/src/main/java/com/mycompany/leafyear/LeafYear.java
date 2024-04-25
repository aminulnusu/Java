
package com.mycompany.leafyear;

import java.util.Scanner;


public class LeafYear {

    public static void main(String[] args) {
       
        Scanner scanner= new Scanner(System.in);
        
        System.out.println("enter the number");
        int year=scanner.nextInt();
        
    boolean leafYear=(year%4==0 || year%400==0);
        System.out.println("leaf year " + leafYear);
        
            
            
        }
        
        
        
        
        
    }

