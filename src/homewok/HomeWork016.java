package homewok;

import class6.SwitchCaseDemo;

import java.util.Scanner;

public class HomeWork016 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade = inp.next().charAt(0);
        switch (grade) {
            case 'A':
                System.out.println("Your grade is A : Excellent grade");
                break;
            case 'B':
                System.out.println("Your grade is B : Good grade");
                break;
            case 'C':
                System.out.println("Your grade is C : Average grade");
                break;
            case 'D':
                System.out.println("Your grade is D : Bad grade");
                break;
            default:
                System.out.println("Your grade is " + grade + " : Not acceptable");
        }
    }
}

