public class SearchInMountain {
    public static void main(String[] args) {
        int [] arr = {1,5,2};           //{1,2,3,4,5,3,1};
        int target = 2;
        int peakEle = peak(arr);
        int searchtarget1= search1(arr, target, peakEle);
        int searchtarget2= search2(arr, target, peakEle);
        if(searchtarget1!= -1) {
            System.out.println(searchtarget1);
        }   else{
            System.out.println(searchtarget2);
        }



    }

    static int peak (int [] arr) {
            int start = 0;
            int end = arr.length - 1;
            while (start<end)
            {
                int mid = start + (end - start ) / 2;
                if(arr[mid] < arr[mid+1]) {
                    start = mid+1 ;
                }
                else {
                    end = mid;
                }
            }
        return start;
    }


    static int search1(int[]arr, int target, int peakEle) {
        int start = 0;
        int end = peakEle;
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

    static int search2(int[]arr, int target, int peakEle) {
        int start = peakEle;
        int end = arr.length-1;
        while (start<=end)
        {
           int mid = start + (end - start ) / 2;

           if(target == arr[mid]) {
               return mid;
           }

           if(target > arr[mid]) {
               end = mid-1;
        }
        else{
               start = mid+1 ;
           }
       }
       return -1;

    }

}
