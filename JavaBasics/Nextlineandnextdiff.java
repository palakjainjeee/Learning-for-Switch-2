package JavaBasics;

import java.util.Scanner;

public class Nextlineandnextdiff {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String letter;
        char value;
        System.out.println(" Enter any letter of your choice");
        letter = obj.nextLine();
        System.out.println(" Your  entered character is " + letter);
        value = letter.charAt(6);
        System.out.println(" Your  entered  string character is " + value);

    }
}
