/*2. For given a 9-digit registration number of a CSE student, identify the year of 
joining. Assuming the first two digits specify the year of joining.  */

import java.util.Scanner;

public class Qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 9-digit registration number: ");
        String reg = sc.next();

        String year = reg.substring(0, 2);
        System.out.println("Year of Joining: 20" + year);

        sc.close();
    }
}
