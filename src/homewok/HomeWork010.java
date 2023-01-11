package homewok;

import java.util.Scanner;

public class HomeWork010 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter the day number");
        int day= inp.nextInt();
        if (day==1|day==2|day==3|day==4|day==5) {
            System.out.println(" It is weekday");
        } else if (day==6|day==7) {
            System.out.println("It is a weekend");
        }else {
            System.out.println("Invalid day");

        }
    }






    }

