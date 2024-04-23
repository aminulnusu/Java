package fahrenheittocelsius59;

import java.util.Scanner;

public class FahrenheitToCelsius59 {

    public static void main(String[] args) {
        
        Scanner input= new Scanner(System.in);
        
        float fahrenheit=input.nextFloat();
        float result=((fahrenheit-32)/9)*5;
        
        System.out.println("Temperature in celciuse:"+result);
        
              
    }

}
