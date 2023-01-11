package homewok;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Enter your multiplication number");
        int num1= inp.nextInt();
        int num=1;
        while(num<=12){
            System.out.println(num1+"*"+num+"=" +(num1*num));
            num++;
        }

    }
}
