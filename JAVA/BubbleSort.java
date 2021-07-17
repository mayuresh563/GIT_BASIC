import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int a[];
        int size, i, j;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size: ");
        size = scan.nextInt();
        a = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(i=0; i<size; i++){
            a[i] = scan.nextInt();
        }
        for (i=0; i<size; i++){
            for (j=i; j<size; j++){
                if (a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("The sorted elements of the array are: ");
        for(i=0; i<size; i++){
            System.out.println(a[i]);
        }
        scan.close();
    }
}
