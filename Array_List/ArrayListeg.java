import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();

        // list.add(1);
        // list.add(12);
        // list.add(14);
        // System.out.println(list.contains(4));
        // list.remove(1);
        // System.out.println(list);
        
        //input
        for(int i=0;i<5;i++)
        {
            list.add(sc.nextInt());
        }
        //output
        for(int i=0;i<5;i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
        System.out.println(list);

    }
}
