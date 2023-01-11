package homewok;

import java.util.Scanner;

public class HomeWork012 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("A what month you were born");
        String month= inp.next();
        if (month.equalsIgnoreCase("June")|month.equalsIgnoreCase("July")|month.equalsIgnoreCase("August")) {
            System.out.println("You were born in the summer");
        } else if (month.equalsIgnoreCase("September")|month.equalsIgnoreCase("October")|month.equalsIgnoreCase("November")) {
            System.out.println("you were born in the fall ");
        } else if (month.equalsIgnoreCase("December")|month.equalsIgnoreCase("January")|month.equalsIgnoreCase("February")) {
            System.out.println("you were born in the winter ");
        } else if (month.equalsIgnoreCase("March")|month.equalsIgnoreCase("April")|month.equalsIgnoreCase("May")) {
            System.out.println("You were born in the spring");

        }
    }

    }



