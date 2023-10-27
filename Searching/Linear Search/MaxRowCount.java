public class MaxRowCount {
    public static void main(String[] args) {
        int [][]arr ={
            {1,2,3},
            {1,2,5,7}
        };
        
        int maxi = Integer.MIN_VALUE;
        for(int row=0; row<arr.length; row++) {
            int sum = 0;
            for (int col=0; col<arr[row].length; col++) {
                sum =sum + arr[row][col];
            }
            if(sum>maxi){
                maxi = sum ;
            }
        }
        System.out.println(maxi);
    }
}
