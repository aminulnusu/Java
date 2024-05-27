
package testthreads59;

import printchar.PrintChar;


public class TestThreads59 {

    
    public static void main(String[] args) {
      
        
          

        Runnable printA = new PrintChar ('a', 100);
        Runnable printB = new PrintChar ('b', 100);
        Runnable print100 = new PrintNum(100);

        // Create threads
        Thread thread1 = new Thread(printA);
        Thread thread2 = new Thread(printB);
       

        // Start threads
        thread1.start();
        thread2.start();
        thread3.start();
       

    }
        
        
    }
    
