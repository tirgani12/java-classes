package homewok;

import java.util.Scanner;

public class HomeWork011 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter quiz,mid term,and final scores");
        double quiz=inp.nextDouble();
        double midTerm=inp.nextDouble();
        double finalS=inp.nextDouble();
        double average=((quiz+midTerm+finalS)/3);
        if (average>=90) {
            System.out.println("grade A");
        } else if (average>=70&&average<90) {
            System.out.println("grade B");
        } else if (average>=50&&average<70) {
            System.out.println("grade C");
        } else if (average<50) {
            System.out.println("grade F");

        }

    }


    }



