import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a name");
        String n = sc.next();
        String personalised = myGreet(n);

        System.out.println(personalised);

        
    }
    static String myGreet(String name){
        String message = "Hello "+name;
        return message;
    }
    
}
