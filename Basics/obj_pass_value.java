import java.lang.reflect.Array;
import java.util.Arrays;

public class obj_pass_value {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,8};
        change(arr);
        System.out.println(Arrays.toString(arr));//print modified array//ref copy will pass//pass by the copy of the value of ref
    }
    static void change(int[] nums){
        nums[0]=99;
    }
    
}
