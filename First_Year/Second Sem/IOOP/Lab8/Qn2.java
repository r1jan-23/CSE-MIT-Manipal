/*2. Design an interface called Series with the following methods  
i) getNext (returns the next number in series)  
ii) reset(to restart the series) 
iii) setStart (to set the value from which the series should start)  
Design a class named ByTwos that implements Series such that it generates a series 
of numbers, each two greater than the previous one. Also design a class which will 
include the main method for referencing the interface. */
interface Series {
    int getNext();
    void reset();
    void setStart(int x);
}

class ByTwos implements Series {
    private int start;
    private int value;

    ByTwos() {
        start = 0;
        value = 0;
    }

    public int getNext() {
        value += 2;
        return value;
    }

    public void reset() {
        value = start;
    }

    public void setStart(int x) {
        start = x;
        value = x;
    }
}

public class Qn2 {
    public static void main(String[] args) {

        Series s = new ByTwos();

        s.setStart(0);
        System.out.println(s.getNext());
        System.out.println(s.getNext());
        System.out.println(s.getNext());

        s.reset();
        System.out.println(s.getNext());
    }
}
