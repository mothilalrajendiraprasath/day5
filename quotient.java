import java.util.Scanner;
public class quotient {
    public  static void main(String[] args) {
        int dividend, divisor;
        System.out.println("Enter the dividend:");
        Scanner sc=new Scanner(System.in);
        dividend=sc.nextInt();
        System.out.println("Enter the divsor:");
        divisor=sc.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        System.out.println("QUOTIENT:"+quotient);
        System.out.println("REMAINDER:"+remainder);
    }
}
