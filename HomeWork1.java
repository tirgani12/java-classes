package HomeWorkClass15;

public class HomeWork1 {
    // 2) Create a method that will take a number and prints whether the number is even or odd.
    String evenOrOdd(int number) {



        if (number % 2 == 0) {

            return number+" is even";

        } else {

            return number+" is odd";


        }




    }


    public static void main(String[] args) {
        HomeWork1 num=new HomeWork1();
        System.out.println(num.evenOrOdd(23));


    }
}
