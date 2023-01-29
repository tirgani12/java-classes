package HomeWorkClass15;

public class HomeWork5 {
    // 6)Create  class Student that will have a method getGrade. Your method should accept the score of a student and return a grade:
    //score > 90 - A
    //score >80 - B
    //score >70 - C
    //score > 50 - D
    //anything else - F


    String getGrade(int score) {

        if (score>90) {
            return score+"-A";

        } else if (score>80&&score<=90) {
            return score+"-B";

        } else if (score>70&&score<=80) {
            return score+"-C";

        } else if (score>50&&score<=70) {
            return score+"-D";

        }else {
            return score+"-F";

        }


    }


        public static void main (String[]args){
            HomeWork5 Grade= new HomeWork5();
            System.out.println(Grade.getGrade(45));


        }
    }

