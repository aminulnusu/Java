
package com.mycompany.testdosum;

import java.util.Random;



public class TestDoSum {

    public static void main(String[] args) {
           int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};
    int sum=doSun(numbers);
        System.out.println(sum); 
   
    }
    int[][] numbers={{1,2,3},{4,5,6},{7,8,9}};
    int sum=doSun(numbers);
    
   
    
    public static int doSun(int [][]myArrays){
        Random r=new Random();
       int sum=0; 
    for(int row=0;row<myArrays.length;row++ )
    for(int col=0;col<myArrays[0].length;col++){
        sum+=myArrays[row][col];
        
    }
    return sum;
    }
 
    
    
}
