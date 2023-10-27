public class ceilAndfloor {
    public static void main(String[] args) {
        int [] arr ={4, 7, 9, 12, 15, 18};
        int target = 19;
        int ceil = ceilingOfNumber(arr, target);
        int floor = floorOfNumber(arr, target);
        System.out.println("Ceiling of a number is: " + ceil);
        System.out.println("Floor of a number is: " + floor);
    }
    static int ceilingOfNumber(int []arr, int target) {
        //If target element is greater than greatest element in the array
        if(target > arr[arr.length-1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]) {
                return  mid;
            }

            if(target>arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return start;
    }

    static int floorOfNumber (int[]arr, int target) {

        //If target element is smaller than smallest element in the array
        if(target < arr[0]) {
            return -1;
        }

        int start = 0;
        int end = arr.length-1;
        
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target == arr[mid]) {
                return  mid;
            }

            if(target>arr[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return end;
    }
    
}
