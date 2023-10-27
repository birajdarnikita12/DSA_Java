import java.util.Scanner;

public class Nested_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empID = sc.nextInt();
        String dept = sc.next();

        switch (empID){
            case 1:
                System.out.println("Nikita Birajdar");
                break;
            case 2:
                System.out.println("Sameer Swankar");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (dept){
                    case "CS":
                    System.out.println("CS Department");
                    break;
                    case "IT":
                    System.out.println("IT Department");
                    default:
                    System.out.println("Enter valid Department");
                    break;


                }
        }
    }
    
}
