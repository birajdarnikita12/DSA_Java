import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum_fun();
    }
    
static void sum_fun(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number 1: ");
    int num1 = sc.nextInt();
    System.out.print("Enter number 2: ");
    int num2 = sc.nextInt();
    int sum = num1 + num2;
    System.out.print("Sum is = " + sum);

}
}
