package HomeWorkClass15;

public class HomeWork4 {
    // 5) Write a method to return whether given number is prime or not?


    String prime(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0 ) {
                count++;
            }
        }
            if (count == 2) {
                return number + " is  prime number";
            } else {


                return number + " is not prime number";


            }

        }
        public static void main (String[]args){
            HomeWork4 num = new HomeWork4();
            System.out.println(num.prime(24));


        }
    }

