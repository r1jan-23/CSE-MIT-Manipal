/*3. For a given date of birth of a person, calculate the date of retirement by taking 
years of service as input. (assume service periods as 60 years). */

import java.util.Scanner;
import java.time.LocalDate;

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter date of birth (yyyy-mm-dd): ");
        LocalDate dob = LocalDate.parse(sc.next());

        LocalDate retirementDate = dob.plusYears(60);

        System.out.println("Date of Retirement: " + retirementDate);

        sc.close();
    }
}
