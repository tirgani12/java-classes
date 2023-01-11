package homewok;


import java.util.Scanner;

public class HomeWork001 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a grade:");
        int n = scan.nextInt();
    if(n >=90 && n <=100){


        System.out.println("grade A");
    }else if(n >=80 && n <=90)

    {
        System.out.println("grade B");
    }else if(n >=70 && n <=80)

    {
        System.out.println("grade C");
    }else if(n >=65 && n <=70)

    {
        System.out.println("grade D");
    }else if(n <=65)

    {
        System.out.println("grade F");
    }else

    {
        System.out.println("the number that you entred is not in the range");
    }
}
}
