package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <10; i++) {

                System.out.println("Do you want a credit card");
                String userResponse=scan.next();
                if (userResponse.equalsIgnoreCase("yes")){
                    break;
            }
        }


    }
}