package homewok;

import java.util.Scanner;

public class HomeWork017 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter 2 numbers and operator(+,-,*,/)");
        double num1 = inp.nextDouble();
        double num2 = inp.nextDouble();
        char op = inp.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2+ "= "+(num1+num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2+ "= "+(num1-num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2+ "= "+(num1*num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2+ "= "+(num1/num2));
                break;
        }
    }
}