package testfactorial1;

public class TestFactorial1 {

    public static void main(String[] args) {

        double faceValue = 5;
        double factorial = 1;

        for (int i = 1; i <= faceValue; i++) {
            factorial *= i;

        }
        System.out.println(factorial);

    }
}
