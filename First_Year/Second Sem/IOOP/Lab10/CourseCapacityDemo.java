import java.util.Scanner;

class CourseFullException extends Exception {
    CourseFullException(String msg) {
        super(msg);
    }
}

class Course {
    private String courseName;
    private int capacity;
    private int enrolledStudents;

    Course(String courseName, int capacity) {
        this.courseName = courseName;
        this.capacity = capacity;
        this.enrolledStudents = 0;
    }

    void enrollStudent() throws CourseFullException {
        if (enrolledStudents >= capacity) {
            throw new CourseFullException("Course is full");
        }
        enrolledStudents++;
        System.out.println("Student enrolled. Total: " + enrolledStudents);
    }
}

public class CourseCapacityDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Course Name: ");
        String courseName = sc.nextLine();
        System.out.println("Enter Course Capacity: ");
        int capacity = sc.nextInt();          
        System.out.println("Enter No of Student to Enroll: ");
        int studentsToEnroll = sc.nextInt();

        Course c = new Course(courseName, capacity);

        try {
            for (int i = 0; i < studentsToEnroll; i++) {
                c.enrollStudent();
            }
        } catch (CourseFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
