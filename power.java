import java.util.Scanner;
 public class power {
     public  static void main(String[] args) {
         int num;
         int p = 2;
         int z = 1;
         System.out.println("Enter the number:");
         Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
         if(num <= 31 ) {
             for (int i = 1; i <= p; i++) {
                 z = num * z;
             }
             System.out.println("power" + z);
         }
     }
}
