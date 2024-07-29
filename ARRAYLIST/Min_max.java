package ARRAYLIST;
/*finding the min and maximum within the array without sorting using one loop */
import java.util.*;
public class Min_max{
public static void main(String[] args) {
    ArrayList<Integer> al=new ArrayList<>();
    System.out.println("enter the size of the element");
    Scanner in=new Scanner(System.in);
    int x=in.nextInt();
    for(int i=0;i<x;i++){
        int k=in.nextInt();
        al.add(k);
    }
    int max=Integer.MIN_VALUE;
    int min=Integer.MAX_VALUE;
    System.out.println(al);
    for(int j=0;j<x;j++){
        
        if(al.get(j)<min){
           min=al.get(j);

        }
        if(al.get(j)>max){
            max=al.get(j);
        }
    }
    System.out.println(min);
    System.out.println(max);

    in.close();
    
}
}