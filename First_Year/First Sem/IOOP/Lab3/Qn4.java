/*4. Create a Die class with one integer instance variable called sideUp. Give it a 
getSideUp() method that returns the values of sideUp and a void roll() method that 
changes sideUpto a random value from 1 to 6.Then create a DieDemo class with a 
method that creates two Die objects, rolls them, and prints the sum of the two sides up. */
import java.util.Random;

class Die {
    int sideUp;

    int getSideUp() {
        return sideUp;
    }

    void roll() {
        Random r = new Random();
        sideUp = r.nextInt(6) + 1;
    }
}

public class Qn4 {
    public static void main(String[] args) {
        Die d1 = new Die();
        Die d2 = new Die();

        d1.roll();
        d2.roll();

        System.out.println("Sum: " + (d1.getSideUp() + d2.getSideUp()));
    }
}
