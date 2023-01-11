package homewok;

import java.util.Scanner;

public class HomeWork004 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the amount of loan needed");
        int loan= input.nextInt();
        if (loan<=200000) {
            System.out.println("You are eligible for loan");
        }else{
            System.out.println("You are not eligible for loan");
        }
    }
}
