public class Array_max {
    public static void main(String[] args) {
        int [] arr = {1, 4, 6, 8, 2};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 2));
    }

    
    static int max(int []arr ) {
        if(arr.length==0){
            return -1;
        }
        int maxval = arr[0];
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }


    static int maxRange(int []arr, int start, int end ) {//maxval in the range

        if((end<start) || (arr == null)){
            return -1;
        }

        int maxval = arr[0];
        for (int i=start; i<=end; i++)
        {
            if(arr[i]>maxval){
                maxval = arr[i];
            }
        }
        return maxval;
    }
}
