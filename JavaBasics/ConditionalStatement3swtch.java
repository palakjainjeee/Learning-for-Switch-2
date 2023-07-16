package JavaBasics;

import java.util.Scanner;

public class ConditionalStatement3swtch {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        char letter;
        System.out.println(" Enter any letter of your choice");
        letter = obj.next().charAt(0);
        switch (letter) {
            case 'a':

                System.out.println(" This is a vowel");
                break;

            case 'e':

                System.out.println(" This is a vowel");
                break;

            case 'i':

                System.out.println(" This is a vowel");
                break;

            case 'o':

                System.out.println(" This is a vowel");
                break;

            case 'u':

                System.out.println(" This is a vowel");
                break;

            default:
                System.out.println(" This is not a vowel");

        }
    }
}
