import java.util.*;
public class GreaterNumber {
    public static void main(String[] args) {
        int a,b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        a = scan.nextInt();
        System.out.println("Enter 2nd number : ");
        b = scan.nextInt();
        if(a>b)
        {
            System.out.println("Greater number is: "+a);
        }else
        {
            System.out.println("Greater number is: "+b);
        }
        scan.close();
    }
}
