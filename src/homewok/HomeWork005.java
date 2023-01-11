package homewok;

import java.util.Scanner;

public class HomeWork005 {
    public static void main(String[] args) {
        Scanner dmv=new Scanner(System.in);
        System.out.println("What is your age");
        int age=dmv.nextInt();
        if (age>=18) {
            System.out.println("you will get a driver licence");
        }else {
            System.out.println("You will get a learners permit");
        }
    }
}
