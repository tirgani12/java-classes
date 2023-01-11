package homewok;

public class HomeWork003 {
    public static void main(String[] args) {
        double mortgageRate = 3;
        int mortgagePrice = 150000;
        if (mortgageRate < 4.5) {
            System.out.println("I will  buy a house");
            if (mortgagePrice > 200000) {
                System.out.println("I will take a loan");
            } else {
                System.out.println("I will pay cash");
            }
        }else {
                System.out.println("I will not bay a house");


        }
    }
}


