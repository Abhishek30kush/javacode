import java.util.*;

public class Student {

    public static void main(String[] args) {

        System.out.println("hello World");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of element : ");
        int n = sc.nextInt();
        System.out.println("Enter the Element of Array ");
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
        }

    }

    public static void xyz(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }
}