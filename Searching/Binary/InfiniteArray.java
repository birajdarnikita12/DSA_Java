public class InfiniteArray {
    public static void main(String[] args) {
        int [] arr = {2, 4, 5, 6, 7, 9, 10, 11, 13, 34, 56, 77, 78, 91, 92, 99};
        int target = 91;
        int range = findingRange(arr, target);
        System.out.println(range);
        
    }
    static int findingRange (int [] arr, int target) {
        //find the range
        // first stsart with the box of size of 2

        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            //double the box value
            // end = previousend +2*sizeof box
            end = end + 2*(end-start+1);  
            start = newStart;
        }
        return search(arr, target, start, end);
    }

    static int search (int []arr, int target, int start, int end) {
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
