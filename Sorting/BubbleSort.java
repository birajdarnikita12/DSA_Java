import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        int [] arr = { 5, 4, 3, 2, 1};
        int []sort = search(arr);
        System.out.println(Arrays.toString(sort));  
    }
    static int []search (int [] arr) {
        int n = arr.length;
        for(int i = 0; i< n; i++) {
            for (int j=1; j<n-i; j++) {
                if (arr[j-1]>arr[j]){
                    int temp =  arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}