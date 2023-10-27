public class FindMaxIn2DArray {
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3},
            {4,51},
            {6,7,8,9}
        };
        int ans= maxi(arr);
        System.out.println(ans);
    }
    static int maxi (int [][] arr) {

        int maxVal = Integer.MIN_VALUE;

        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] >  maxVal) {
                    maxVal = arr[row][col];
                }
            }
        }
        // for(int []a : arr){
        //     for(int element : a){
        //         if(element >  maxVal) {
        //             maxVal = element;
        //         }
        //     }
        // }
        return maxVal;
    }
}
