/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("pls enter the value of lenght");

        int lengt = input.nextInt();
        System.out.println("pls enter the value width");
        int width = input.nextInt();
        
        double rectangle;
        
        rectangle = lengt + width;
        System.out.println(rectangle);

    }

}
