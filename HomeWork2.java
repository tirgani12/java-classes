package HomeWorkClass15;

public class HomeWork2 {
    // 3) Create a method that will print whether given String is palindrome or not.
    String palindrome(String word) {
        String str=word;
        String rev="";
        for (int i=word.length()-1;i>=0;i--){
            rev=rev+word.charAt(i);
        }
        if (str.equals(rev)){
            return str+" is palindrome string";
        }else {
            return str+" is not palindrome string";
        }





    }


    public static void main(String[] args) {
        HomeWork2 srt=new HomeWork2();
        System.out.println(srt.palindrome("madam"));


    }
}
