package HomeWorkClass15;

public class HomeWork3 {
    // 4)Create a method that will say Hello in different language based on the country that will
    // passed when method is executed



    String helloDifferentLanguage(String language) {
        if (language.equals("Spanish")) {


            return "holla";
        }
        if (language.equals("German")) {

            return "hallo";
        }
        if (language.equals("italian")) {

            return "ciao";
        }

        if (language.equals("Frensh")) {
        }
           return "salut";




    }


    public static void main(String[] args) {
        HomeWork3 language=new HomeWork3();
        System.out.println(language.helloDifferentLanguage("German"));


    }
}
