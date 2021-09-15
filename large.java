import java.util.Scanner;
public class large {
    public  static void main(String[] args) {
        int a, b, c;
        System.out.println("Enter the numbers:");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a > b || a > c)
            System.out.println("A is large");
        else if (b > a || b > c)
            System.out.println("B is large");
        else if(c>a || c>b)
            System.out.println("C is large");
        else
            System.out.println("done");

    }
}
