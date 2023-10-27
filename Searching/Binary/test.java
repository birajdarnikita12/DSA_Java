class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int index = lastIndex (numbers, target);
        int [] ans = answer (numbers, index, target);
         return ans;
    }

        static int lastIndex(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while(start<=end) {
            int ans;
            int mid = start + (end - start) / 2;
            if(numbers[mid] == target) {
                return mid;
            }

            if(numbers[mid] < target) {
                start = mid + 1;
            }
            else{
                end = mid -1;
            }
        }
        return end;
        }

        static int [] answer(int[] numbers, int lastIndex, int target) {
            int start = 0;
            int end = lastIndex;
            while(start<=lastIndex){
                int sum = numbers[start] + numbers[end];
                if(sum==target){
                    // return new int [] {start+1, end+1};
                    break;
                }
                if(sum<target){
                    start=start+1;
                }
                else{
                    end = end - 1;
                }
            }
            if(end<start){
                return new int [] {end+1, start+1};
            }
        return new int [] {start+1, end+1};
        }
        
    
}