import java.util.Scanner;

class Student {
    double calculateAverage(int totalMarks, int numberOfSubjects) {
        if (numberOfSubjects == 0) {
            throw new ArithmeticException("Number of subjects cannot be zero");
        }
        return (double) totalMarks / numberOfSubjects;
    }
}

public class MarksValidationDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student s = new Student();

        try {
            System.out.println("Enter Total Marks: ");
            int totalMarks = sc.nextInt();
            System.out.println("Enter Total Subjects: ");

            int subjects = sc.nextInt();
            double avg = s.calculateAverage(totalMarks, subjects);
            System.out.println("Average Marks: " + avg);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
