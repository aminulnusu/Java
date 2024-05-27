
package testwriteread;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class TestWriteRead {

 
    public static void main(String[] args) throws FileNotFoundException {
      
        File file=new File("C:\\Users\\Administrator\\Desktop\\1.txt");
        PrintWriter pw=new PrintWriter(file);
        pw.write("love babu");
        pw.close();
        
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
    }
    
}
