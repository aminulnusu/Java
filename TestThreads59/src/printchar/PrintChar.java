package printchar;

public class PrintChar implements Runnable {

    private char charToPrint; // The character to print
    private int times; // The number of times to repeat

    public PrintChar(char charToPrint, int times) {
        this.charToPrint = charToPrint;
        this.times = times;
    }

    @Override
    public void run() {
        for (int i = 0; i < times; i++) {
            System.out.print(charToPrint);
        }
    }
}
    class PrintNum implements Runnable{

    private int lastNum;

    /**
     * Construct a task for printing 1, 2, ..., n    /**
     * Tell the thread how to run
     */
    public PrintNum(int lastNum) {
        this.lastNum = lastNum;
    }

    /**
     * Tell the thread how to run
     */
    @Override
    public void run() {
        for (int i = 1; i <= lastNum; i++) {
            System.out.print(" " + i);
        }
    }

    
    }
