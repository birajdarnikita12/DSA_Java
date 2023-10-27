
public class Occurence {
    public static void main(String[] args) {
        int n = 1385757877;
        int count = 0;
        while(n>0)
        {
            int digit = n%10;
            n = n / 10;
            if(digit == 7)
            {
                count++;
            }

        }
        System.out.println(count);
    }
    
}
