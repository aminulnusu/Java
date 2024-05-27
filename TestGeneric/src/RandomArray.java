
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
       
//        int[] array = new int[100];
LinkedList list=new LinkedList();
        Random random = new Random();
        for (int i = 0; i <100; i++) {
            list.add(random.nextInt(101));
        }
        System.out.println(list);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an index (0-99): ");
        int index = scanner.nextInt();

        
        try {
            int element =scanner.nextInt();
            System.out.println(list.get(index));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of Bounds");
        }
    }
}