import java.util.Scanner;
public class vowel {
    public  static void main(String[] args) {
        System.out.println("Enter the alphabet:");
        Scanner sc=new Scanner(System.in);
        char alpha=sc.next().charAt(0);
        if(alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == '0'|| alpha == 'u')
            System.out.println("It is vowel");
        else
            System.out.println("It is not vowel");
    }
}
