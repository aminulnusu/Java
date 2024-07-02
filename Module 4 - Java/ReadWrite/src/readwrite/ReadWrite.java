
package readwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWrite {

    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\ASUS\\Desktop\\nusu.txt");
       
       PrintWriter pw = new PrintWriter(file);
       pw.write("Babur");
       pw.close();
       
       Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
       
    }
   
  
}
