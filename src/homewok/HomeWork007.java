package homewok;

import java.util.Scanner;

public class HomeWork007 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Did you have a credit card");
        boolean creditCard= input.nextBoolean();


        if (creditCard){

            System.out.println("What is the balance on the card");
            int balance= input.nextInt();
            if (balance>1000) {
                System.out.println("You need to pay off your balance immediately");
            }else {
                System.out.println("You can spend more");
            }
        }else {
            System.out.println("You are qualified for a credit card");        }
    }
}
