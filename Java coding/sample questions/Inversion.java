
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A[], i, j, count;
        System.out.println("Enter the number of elements in Array");
        Scanner scn = new Scanner(System.in);
        int number = scn.nextInt();
        System.out.println("Enter the elements in array");
        for (i = 0; i < number; i++) {
            A[i] = scn.nextInt();
        }
        for (i = 0; i < number; i++) {
            for (j = i + 1; j < number; j++) {
                if (i < j && A[i] > A[j]) {
                    count++;
                }
            }
        }
        System.out.println("The number of inversion of the elements is %d", count);
    }
}
