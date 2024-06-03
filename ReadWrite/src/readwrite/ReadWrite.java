
package readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ReadWrite {

   
    public static void main(String[] args) throws FileNotFoundException {
       File file=new File("C:\\Users\\Administrator\\Desktop\\Aminul.txt");
       PrintWriter pw=new PrintWriter(file);
        pw.write("Enter name");
        pw.close();
        
        
        Scanner scanner=new Scanner(file);
        
        System.out.println(scanner.nextLine());
    }
    
}
