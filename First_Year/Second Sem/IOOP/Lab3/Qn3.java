/*3. Define a class Mixer to merge two sorted integer arrays in ascending order with the following instance variables and methods: 
instance variables: 
int arr[] //to store the elements of an array 
Methods: 
void accept()  // to accept the elements of the array in ascending order without any duplicates 
Mixer mix(Mixer A) // to merge the current object array elements with the parameterized array elements and return the resultant object 
void display() // to display the elements of the array Define the main() method to test the class.  */

import java.util.Scanner;

class Mixer {
    int[] arr;

    void accept(Scanner sc) {
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        arr = new int[n];
        System.out.println("Enter elements in ascending order:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
    }

    Mixer mix(Mixer A) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[arr.length + A.arr.length];

        while (i < arr.length && j < A.arr.length) {
            if (arr[i] < A.arr[j])
                temp[k++] = arr[i++];
            else if (arr[i] > A.arr[j])
                temp[k++] = A.arr[j++];
            else {
                temp[k++] = arr[i++];
                j++;
            }
        }

        while (i < arr.length)
            temp[k++] = arr[i++];

        while (j < A.arr.length)
            temp[k++] = A.arr[j++];

        Mixer result = new Mixer();
        result.arr = new int[k];
        for (int x = 0; x < k; x++)
            result.arr[x] = temp[x];

        return result;
    }

    void display() {
        for (int x : arr)
            System.out.print(x + " ");
        System.out.println();
    }
}

public class Qn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Mixer m1 = new Mixer();
        Mixer m2 = new Mixer();

        m1.accept(sc);
        m2.accept(sc);

        Mixer m3 = m1.mix(m2);
        m3.display();

        sc.close();
    }
}
