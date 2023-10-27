import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        // Scanner sc =  new Scanner(System.in);
        // int num = sc.nextInt();
        for(int i = 100; i<1000; i++){
            if(isArmstrong(i)){
                System.out.println(i);
            }
        }
        
    }
    static boolean isArmstrong(int n){
        int ans = 0;
        int original = n;
        while(n>0){
            int rem = n % 10;
            n /= 10;
            ans = ans + (rem*rem*rem);
        }
        if(original == ans){
            return true;
        }
        return false;
    }
}
