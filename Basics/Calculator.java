import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter an operator");
        char op = sc.next().trim().charAt(0);
        int ans = 0;

        if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%' )
        {
            System.out.println("Enter two numbers");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            if(op == '+')
            {
                ans = num1 + num2;
            }
            if(op == '-')
            {
                ans = num1 - num2;
            }
            if(op == '*')
            {
                ans = num1 * num2;
            }
            if(op == '/' && num2!=0)
            {
                ans = num1 / num2;
            }           
            if(op == '%')
            {
                ans = num1 % num2;
            }
        }
            else if(op == 'X' || op == 'x' )
            {
                break;
            }
            else
            {
                System.out.println("Invalid operation!!");
            }
            System.out.println(ans);
    }
        
    }
    
}
