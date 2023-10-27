import java.util.Arrays;
import java.util.Scanner;
public class MultidimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows:");
        int r=sc.nextInt();
        System.out.println("Enter no of colums:");
        int c=sc.nextInt();
        int [][] arr=new int[r][c];
        // int arr[][] = {
        //     {1,2,3},
        //     {4,5},
        //     {7,8,9,8}
        // };
        System.out.println("Enter matrix elements of "+r+" x "+c+" matrix:");
         for(int row=0; row<arr.length; row++)
        {
            for(int col=0; col<arr[row].length; col++)
            {
                arr[row][col]=sc.nextInt();
            }
        }
        System.out.println("The matrix is:");
        for(int row=0; row<arr.length; row++)
        {
            for(int col=0; col<arr[row].length; col++)
            {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println("");
        }
        
        System.out.println("The matrix is (toString):");
        for(int row=0; row<arr.length; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }
        
        System.out.println("The matrix is (toString) using for each loop:");
        for(int [] element:arr)
        {
                System.out.println(Arrays.toString(element));
        }
    }
    
}
