import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = { 5, 4, 3, 2, 1};
        int []sort = search(arr);
        System.out.println(Arrays.toString(sort));  
    }
    static int []search (int [] arr) {
        int n = arr.length;
        for(int i = 0; i< n-1; i++) {
            int maxIndex = 0;
            for(int j=1; j< n-i; j++){
                if(arr[maxIndex]<arr[j]){
                    maxIndex= j;
                }
            }
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[n-i-1];
            arr[n-i-1]= temp;
        }
        return arr;
    }
    
}
