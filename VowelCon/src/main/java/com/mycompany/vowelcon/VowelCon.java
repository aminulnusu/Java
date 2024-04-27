/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.vowelcon;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VowelCon {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter the letter");
        
        char letter=scanner.nextLine().toLowerCase().charAt(0);
         if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'){
             System.out.println(letter + " :vowel");
         }
         else{
             System.out.println(letter + " :consonen");
         }
        
    }
}
