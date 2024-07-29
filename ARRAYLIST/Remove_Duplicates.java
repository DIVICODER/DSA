package ARRAYLIST;
/*remove the duplicate */

import java.util.*;
class Duplicate{

    //created a constructor
    Duplicate(ArrayList<Integer> arr, Integer size){
        ArrayList <Integer> p= new ArrayList<>();
        
        //
        for(int i=0;i<size;i++){
            boolean dup=false;
            for(int j=i+1;j<size;j++){
                if(arr.get(i).equals(arr.get(j))){
                    dup=true;
                    break;
                }
            }
                if(!dup){
                    p.add(arr.get(i));

                }
        }
            System.out.println(p);
       
       
        
    }
}
public class Remove_Duplicates {
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
                //method call
                new Duplicate(al,val);

                //closing the scanner to prevent the leakage.
                in.close();
        
    }
}
