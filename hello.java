import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        System.out.println("Enter the array size : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[10];
        for(int i = 0; i <n; i++){
            array[i]= sc.nextInt();
        }
        for (int i =0; i<n; i++){
            System.out.println(array[i]);
        }
    }
}
