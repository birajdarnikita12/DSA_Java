
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class EvenDigits {
    public static void main(String[] args) {
        int []nums = {33, 5, 678, 2222, 422};
        
        int even = 0;
        for(int no : nums ) {
            int count = 0;
            while(no>0){
                no=no/10;
                count++;
            }
            if(count%2==0) {
                even++;
            }
        }


        System.out.println(even);
    }
}
