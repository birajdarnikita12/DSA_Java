import java.util.Scanner;

public class Fib {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        
        while(count<= n)
        {
         int x = a + b;
         a = b;
         b = x ;
         count++;
         System.out.print(" "+x);
        }
    }
}
         


    
