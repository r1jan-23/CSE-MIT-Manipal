/*4. Create a class called Counter that contains a static data member to count the number 
of Counter objects being created. Also define a static member function called 
showCount() which displays the number of objects created at any given point of 
time. Illustrate this.  */

class Counter {
    static int count = 0;

    Counter() {
        count++;
    }

    static void showCount() {
        System.out.println("Number of objects created: " + count);
    }
}

public class Qn4 {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter.showCount();

        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter.showCount();
    }
}
