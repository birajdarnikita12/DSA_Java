public class SearchInRange {
    public static void main(String[] args) {
        int []arr ={3, 6, 2, 8, 9, 0};
        int start = 1;
        int end = 5;
        int target = 3;
        int ans = search (arr, start, end, target);
        System.out.println(ans);
        
    }

    static int search (int []arr, int start, int end, int target) {

        if(arr.length == 0) return -1;

        for (int i=start; i<=end; i++){
            if(target == arr[i])
            {
                System.out.print("Element is at an index: ");
                return i;
            }
        }
        return -1;
    }    
}
