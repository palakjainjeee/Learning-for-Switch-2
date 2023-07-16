package JavaBasics;

import java.util.Scanner;

public class ConditionalStatement {

    public static void main(String[] args) {
        /*
         * * int age = 28;
         * if (age >= 18) {
         * System.out.println("You are adult because your age is " + age);
         * } else {
         * System.out.println("You are not adult because your is " + age);
         * }
         */

        Scanner obj = new Scanner(System.in);
        int age;
        String name;
        System.out.println("Enter the your age and name");
        age = obj.nextInt();
        name = obj.nextLine();
        if (age >= 18) {
            System.out.println(" You are adult because your age is " + age + name);

        } else {
            System.out.println("You are not adult because your is " + age + name);
        }

    }
}
