/*3. Design a class Student with the methods, getRollNum() and putRollNum() to read 
and display the Roll No. of each student; and getMarks() and putMarks() to read and 
display their marks. Create an interface called Sports with a method putSportsScore() 
that will set the score obtained by a student in physical education examination. Design 
a class called Result that will implement this interface to generate the result by 
considering both the marks and sports score.  */
import java.util.Scanner;

class Student {
    protected int rollNo;
    protected int marks;

    void getRollNum(int r) {
        rollNo = r;
    }

    void putRollNum() {
        System.out.println("Roll No: " + rollNo);
    }

    void getMarks(int m) {
        marks = m;
    }

    void putMarks() {
        System.out.println("Marks: " + marks);
    }
}

interface Sports {
    void putSportsScore(int s);
}

class Result extends Student implements Sports {
    private int sportsScore;

    public void putSportsScore(int s) {
        sportsScore = s;
    }

    void displayResult() {
        putRollNum();
        putMarks();
        System.out.println("Sports Score: " + sportsScore);
        System.out.println("Total Score: " + (marks + sportsScore));
    }
}

public class Qn3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Result r = new Result();

        System.out.println("Enter Roll Number:");
        r.getRollNum(sc.nextInt());

        System.out.println("Enter Marks:");
        r.getMarks(sc.nextInt());

        System.out.println("Enter Sports Score:");
        r.putSportsScore(sc.nextInt());

        r.displayResult();
        sc.close();
    }
}
