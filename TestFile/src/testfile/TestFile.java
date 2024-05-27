
package testfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestFile {


    public static void main(String[] args) throws FileNotFoundException {
       
        File file=new File("C:\\Users\\Administrator\\Desktop\\\\nusu.txt");
        PrintWriter pw=new PrintWriter(file);
        pw.write("choler mao");
        pw.close();
        
        Scanner scanner=new Scanner(file);
        System.out.println(scanner.nextLine());
    }
    
}
