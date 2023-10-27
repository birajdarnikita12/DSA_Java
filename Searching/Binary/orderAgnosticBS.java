public class orderAgnosticBS {
    public static void main(String[] args) {
        int []arr = {9, 7, 5, 3, 2};
        // int []arr ={2, 3, 5, 7, 9};
        int target = 2;          

    int ans = search(arr, target);
    System.out.println(ans);
    }

    static int search (int []arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        // if(arr[0] < arr[arr.length - 1]) {
        //     isAsc = true;
        // }
        // else{
        //     isAsc = false;
        // }


         while (start<=end) {

            int mid = start + (end - start ) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc) {
                if(target > arr[mid]) {
                start = mid+1 ;
                }
                else{
                    end = mid-1;
                }
            }

            else {
                if(target > arr[mid]) {
                    end = mid-1;
                }
                else {
                    start = mid+1 ;
                    }
            }
        }
        return -1;
    }

    
}
