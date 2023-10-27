public class Reverse {
    public static void main(String[] args) {
        int n =3425;
        int ans = 0;
        while(n>0)
        {
            int digit = n % 10;
            n /= 10;
            ans = ans * 10 + digit;
        }
        System.out.println(ans);
    }
    
}
