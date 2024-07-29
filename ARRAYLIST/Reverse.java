package ARRAYLIST;

/*REVERSE THE ARRAYLIST USING SWAP CONCEPTS GET THE START AND END OF THE REVERSE FROM THE USER AND WORK ACCORDINGLY*/
import java.util.ArrayList;
import java.util.Scanner;
class Rev{
    Rev(ArrayList<Integer> arr,Integer s,Integer e){
        Integer swap=0;
      
        while(s<e){
            swap=arr.get(s);
            arr.set(s, arr.get(e));
            arr.set(e, swap);
            s++;
            e--;
        }
        System.out.println(arr);
    }
}

public class Reverse{
    public static void main(String[] args) {
        //creating the collection
        ArrayList<Integer> al=new ArrayList<>();
        Scanner in=new Scanner(System.in);

        //getting the size of the array
        System.out.println("Enter the number of elements");
        Integer val=in.nextInt();

        //
        System.out.println("Enter the elements");
        for(int i=0;i<val;i++){
           Integer k=in.nextInt();
            al.add(k);
        }
        System.out.println("Enter the starting of swap:");
        Integer start=in.nextInt();
        System.out.println("Enter the ending of swap:");
        Integer end=in.nextInt();
        new Rev(al,start,end);
        in.close();
        
       
    }
}