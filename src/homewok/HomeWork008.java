package homewok;

import java.util.Scanner;

public class HomeWork008 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number of worked years");
        int years= input.nextInt();
        System.out.println("Enter annual salary");
        int salary= input.nextInt();
        if (years >= 5) {
            System.out.println("You are eligible for the bonus");
            if (salary>5000){
                System.out.println("Your bonus=5000");
            }else {
                System.out.println("Your bonus=3000");
            }
        }else {
            System.out.println("You are not eligible for the bonus");
        }
    }
}
