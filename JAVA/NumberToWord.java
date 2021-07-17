import java.util.Scanner;
public class NumberToWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scan.nextInt();
        int tem;
        int rev = 0;
        int flag;
        if(n%10==0){
            flag = 1;
        }else{
            flag = 0;
        }
        while(n != 0){
            tem = n % 10;
            rev = rev * 10 + tem;
            n = n/10;
        }
        n = rev;
        while(n != 0){
            tem = n % 10;
        switch(tem){
            case 1 : System.out.println("One ");
                break;
            case 2 : System.out.println("Two ");
                break;
            case 3 : System.out.println("Three ");
                break;
            case 4 : System.out.println("Four ");
                break;
            case 5 : System.out.println("Five ");
                break;
            case 6 : System.out.println("Six ");
                break;
            case 7 : System.out.println("Seven ");
                break;
            case 8 : System.out.println("Eight ");
                break;
            case 9 : System.out.println("Nine ");
                break;   
        }
        n = n/10;
        }
        if (flag == 1)
        {
            System.out.println("Zero");
        }
        scan.close();
    }
}