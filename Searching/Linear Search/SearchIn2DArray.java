import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int [][] arr = {
            {2, 3, 4},
            {1, 0},
            {5, 6, 8, 7, 9}
        };
        int target = 5;
        int[] ans = search(arr, target); //format of return value which contains row and col
        System.out.println(Arrays.toString(ans)); 
    }

    static int[] search (int [][]arr, int target) {
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col] ==  target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int []{-1, -1};
    }
    
}
