package homewok;

import java.util.Scanner;

public class HomeWork009 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter your heights in inches");
        int height= inp.nextInt();
        if (height<60) {
            System.out.println("You are short");
        } else if (height>60 && height<70) {
            System.out.println("You are medium");
        } else if (height>70) {
            System.out.println("You are tall");

        }

    }
    }


