/*Lab Exercises: 
1. Consider the already defined STUDENT class. Provide a default constructor and 
parameterized constructor to this class. Also provide a display method. Illustrate all 
the constructors as well as the display method by defining STUDENT objects.  */
class STUDENT {
    String name;
    int rollNo;
    double marks;

    STUDENT() {
        name = "Unknown";
        rollNo = 0;
        marks = 0.0;
    }

    STUDENT(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class Qn1 {
    public static void main(String[] args) {
        STUDENT s1 = new STUDENT(); 
        STUDENT s2 = new STUDENT("Rijan", 101, 85.5); 
        s1.display();
        s2.display();
    }
}
