/*3. Create a Building class with two subclasses namely, House and School. The Building 
class contains fields for square footage and stories. The House class contains 
additional fields for number of bedrooms and baths. The School class contains 
additional fields for number of classrooms and grade level (for example, elementary 
or junior high). All the classes contain appropriate overloaded constructors and 
methods to display the details. In a separate class that contains main(), demonstrate 
the working of this hierarchy. */
class Building {
    protected double squareFootage;
    protected int stories;

    Building() {
        squareFootage = 0;
        stories = 0;
    }

    Building(double squareFootage, int stories) {
        this.squareFootage = squareFootage;
        this.stories = stories;
    }

    void display() {
        System.out.println("Square Footage: " + squareFootage);
        System.out.println("Stories: " + stories);
    }
}

class House extends Building {
    private int bedrooms;
    private int baths;

    House() {
        super();
        bedrooms = 0;
        baths = 0;
    }

    House(double squareFootage, int stories, int bedrooms, int baths) {
        super(squareFootage, stories);
        this.bedrooms = bedrooms;
        this.baths = baths;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Bedrooms: " + bedrooms);
        System.out.println("Baths: " + baths);
    }
}

class School extends Building {
    private int classrooms;
    private String gradeLevel;

    School() {
        super();
        classrooms = 0;
        gradeLevel = "";
    }

    School(double squareFootage, int stories, int classrooms, String gradeLevel) {
        super(squareFootage, stories);
        this.classrooms = classrooms;
        this.gradeLevel = gradeLevel;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Classrooms: " + classrooms);
        System.out.println("Grade Level: " + gradeLevel);
    }
}

public class Qn3 {
    public static void main(String[] args) {

        Building b = new Building(5000, 3);
        b.display();

        System.out.println();

        Building h = new House(2500, 2, 4, 3);
        h.display();

        System.out.println();

        Building s = new School(15000, 4, 20, "Junior High");
        s.display();
    }
}
