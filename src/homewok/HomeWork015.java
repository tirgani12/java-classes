package homewok;

import java.util.Scanner;

public class HomeWork015 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter your country");
        String country= inp.next();
        switch (country.toLowerCase()){
            case "china":
            System.out.println("You speak chinese");
            break;
            case "usa":
                System.out.println("you speak english");
                break;
            case "italy":
                System.out.println("you speak italian");
                break;
            case "morocco":
                System.out.println("you speak arabic");
                break;
            case "spain":
                System.out.println("you speak spanish");
                break;

        }

            }
        }


