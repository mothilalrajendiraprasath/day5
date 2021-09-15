import java.util.Scanner;
public class swap {
    public  static void main(String[] args) {
        int a,b;
        System.out.println("Enter the numbers:");
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("not swapped:"+a  +b);
                int x=b;
                int y=a;
        System.out.println("swapped:"+x  +y);
    }
}
