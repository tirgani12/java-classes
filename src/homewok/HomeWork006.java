package homewok;

import java.util.Scanner;

public class HomeWork006 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your city");
        String city= input.next();
        System.out.println("What the temperature");
        int temp= input.nextInt();
        System.out.println("The temperature in the " +city+ " is "+(temp-32)*5/9);
    }
}

