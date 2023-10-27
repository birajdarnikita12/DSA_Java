public class FindMin {
    public static void main(String[] args) {
        int []arr = {7, 0, 3, 1, -1};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min (int []arr) {
        int minNum = arr [0];
        for (int i=1; i<arr.length; i++) {
            if(arr[i] < minNum)
            {
                minNum = arr[i];
            }

        } 
        return minNum;
    }
}