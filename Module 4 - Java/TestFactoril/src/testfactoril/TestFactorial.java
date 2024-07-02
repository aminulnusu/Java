
package testfactoril;

public class TestFactorial {

    public static void main(String[] args) {
      
        int fakValue=5;
        int factorial=1;
        
         
        for(int i=fakValue;i>1;i--){
        factorial*=i; 
                
                System.out.println("Factorial of "+fakValue+" is: " + factorial);
        
        
        }
        
    }
    
}
