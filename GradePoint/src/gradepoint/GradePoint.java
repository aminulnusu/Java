package gradepoint;

import java.util.Scanner;

public class GradePoint {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the number");
        int marks = input.nextInt();
String grade = "";
        if (marks <= 32) {
            grade = "F";
        } else if (marks <= 39) {
            grade = "D";
        } else if (marks <= 49) {
            grade = "C";
        } else if (marks <= 59) {
            grade = "B";
        } else if (marks <= 69) {
            grade = "A-";
        } else if (marks <= 79) {
            grade = "A";
        } else if (marks <= 100) {
            grade = "A+";
        } else {
            grade = "wrong numbers";
        }

        System.out.println("grade");

    }

}
