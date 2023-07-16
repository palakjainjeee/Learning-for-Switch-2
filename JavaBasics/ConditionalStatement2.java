package JavaBasics;

import java.util.Scanner;

public class ConditionalStatement2 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        int marks;
        System.out.println(" Enter your marks");
        marks = obj.nextInt();
        if (marks < 50) {
            System.out.println(" Fail" + marks);
        } else if (marks >= 50 && marks <= 60) {
            System.out.println(" Your grade is D " + marks);
        } else if (marks >= 60 && marks <= 70) {
            System.out.println(" Your grade is C " + marks);
        } else if (marks >= 70 && marks <= 80) {
            System.out.println(" Your grade is B " + marks);
        } else if (marks >= 80 && marks <= 90) {
            System.out.println(" Your grade is A " + marks);
        } else if (marks >= 90 && marks <= 100) {
            System.out.println(" Your grade is A+ " + marks);
        } else {
            System.out.println(" Invalid input");
        }
    }

}
