public class linear_search {
    public static void main(String[] args) {
        int [] arr = {2,4,5,6,7};
        int target = 6;
        int ans = search(arr, target);
        System.out.println(ans);
        

    }
    //search in the array : return the index if the item found else return -1         
    static int search(int [] arr, int target){
        if(arr.length==0){
            return -1;
        }

        for(int i=0; i<arr.length; i++)
        {
            if(target==arr[i]){
                return i;
            }
        }
        return -1;

    }                                                  
    
}