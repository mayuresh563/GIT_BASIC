import java.util.*;
public class Array {
    public static void main(String[] args) {
        int a[];
        int size, i, sum;
        float avg;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = scan.nextInt();
        a = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<size; i++){
            a[i] = scan.nextInt();
        }
        sum = 0;
        for(i=0;i<size;i++){
            sum = sum+a[i];
        }
        avg = (float)sum/size; //explicit typecasting
        System.out.println("The elements of the array are: ");
        for (i=0; i<size; i++){
            System.out.println(a[i]);
        }
        System.out.println("Sum is : "+sum);
        System.out.println("Average is : "+avg);
    }
}
