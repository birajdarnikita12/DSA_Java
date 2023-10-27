public class mountain {
    public static void main(String[] args) {
        int []nums = {1,2,4,3,5,6,4};
        
        System.out.println(findPeakElement(nums));
        
    }
    static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (start<end) {
        
                int mid = start + (end - start ) / 2;
            
                if(nums[mid]<=nums[mid+1]) {
                    //You are in ascending part of the array
                    // we know that mid+1 > mid element
                    start=mid+1;
                }
                else if(nums[mid]>nums[mid+1]) {
                    //you are in decreasing part of the array
                    //this may be the answer, but look at the left
                    // this is why end != end-1
                    end=mid;
                }  
        }
        //in the end, start == end and poiting to the largest number 
        //start and end always trying to find the max element int the above 2 checks
        //hence when they are pointing  to just one element, that is the max becoz that is what the check says
        return start;
    }
}
