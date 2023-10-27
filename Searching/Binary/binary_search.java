public class binary_search {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 6, 7};
        int target = 7;
        int ans = search(arr, target);
        System.out.println(ans);

    }
    static int search (int []arr, int target) {
            int start = 0;
            int end = arr.length - 1;
             while (start<=end)
         {
            int mid = start + (end - start ) / 2;

            if(target == arr[mid]) {
                return mid;
            }

            if(target > arr[mid]) {
                start = mid+1 ;
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }    
}

