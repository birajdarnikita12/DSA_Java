public class RBS {
    public static void main(String[] args) {
        int nums [] = {3,5,1}; //{4, 5, 6, 3, 2, 1, 0};
        int target = 3;
        
        System.out.println(search(nums, target));
       
    }

    static int search(int[]nums, int target) {
        int pivot = findPivot(nums);
        //if did not find pivot , it means numsay is not rotated
        if(pivot == -1) {
            //just do normal binary search
            return binary_search(nums, target, 0, nums.length-1);
        }

        // if pivot is found, you have found two asc sorted nums
        if(nums[pivot]==target) {
            return pivot;
        }

        if(target >= nums[0]) {
            return binary_search(nums, target, 0, pivot-1);
        }
        return binary_search(nums, target, pivot+1, nums.length-1);
    }

    static int binary_search (int []nums, int target, int start, int end) {
         while (start<=end)
        {
            int mid = start + (end - start ) / 2;

            if(target == nums[mid]) {
                return mid;
            }

            if(target > nums[mid]) {
                start = mid+1 ;
            }
            else{
                end = mid-1;
            }
        }
        return -1;

    }    

    static int findPivot(int [] nums) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid= start + (end - start) / 2;
            if(mid<end && nums[mid] > nums[mid+1]) {
                return mid;
            }
            if(mid>start && nums[mid] < nums[mid-1]) {
                return mid-1;
            }
            if(nums[start]>=nums[mid]) {
                end = mid - 1;
            } 
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
