import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the size of an array");
        int num = sc.nextInt(); 

        int [] arr =new int[num];

        System.out.println("Enter an array elements");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();            
        }
        System.out.println("Array elements are printed as");
        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        for(int i : arr)//for every element in the array, print an element
        {
            System.out.print(i+" ");// here i represents element os the array
        }
        // arr [0]  = 5;
        // arr [1]  = 15;
        // arr [2]  = 25;
        // arr [3]  = 35;
    
  }
}
