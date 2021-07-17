import java.util.*;
public class Eligible {
     public static void main(String[] args) {
          int age;
          Scanner scan = new Scanner(System.in);
          System.out.println("Enter your age : ");
          age = scan.nextInt();
          if(age>18){
               System.out.println("You are eligible to vote ");
          }else{
               System.out.println("You are not eligible to vote ");
          }
          scan.close();
     }
}
