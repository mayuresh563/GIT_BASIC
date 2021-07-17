import java.util.*;
public class ArithmeticOperator{
    public static void main(String[] args) {
        float a,b,add,sub,mul,div;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1st number ");
        a = scan.nextFloat();
        System.out.println("Enter 2nd number ");
        b = scan.nextFloat();
        add = a + b;
        System.out.println("The sum is : "+add);
        sub = a - b;
        System.out.println("The difference is : "+sub);
        mul = a * b;
        System.out.println("The product is : "+mul);
        div = a / b;
        System.out.println("The division is : "+div);
    }
}