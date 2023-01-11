package homewok;

import java.util.Scanner;

public class HomeWork013 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter 3 different numbers");
        double num1= inp.nextDouble();
        double num2= inp.nextDouble();
        double num3= inp.nextDouble();
        if (num1>num2&&num1>num3) {
            System.out.println("The larger number is " + num1);
        } else if (num2>num1&&num2>num3) {
            System.out.println("The larger number is " + num2);
        } else if (num3>num1&&num3>num2) {
            System.out.println("The larger number is " + num3);

        }

    }
    }



