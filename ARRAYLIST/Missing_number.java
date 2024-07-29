package ARRAYLIST;

import java.util.*;
class Missing{

    // finding missing number using sum of the numbers in the range
    // public static int approach2(ArrayList<Integer>ar1){
    //     Integer m2=0;
    //     for(int i=ar1.get(0);i<ar1.size();i++){
    //         if(!(ar1.contains(ar1.get(i+1)))){
    //             m2=i+1;
    //         }

    //     }

    // }
    public static int cal(ArrayList<Integer> arr){
        Integer m=0;
        for(int i=0;i<arr.size()-1;i++){
             /* if!(arr[i+1]==arr[i]++) */
             Integer p=arr.get(i+1);
             Integer l=arr.get(i);
            if(p!=(l+1)){
                m=l+1;
                break;
               
            }

        }
        return m;
    }
}
public class Missing_number {
    public static void main(String[] args) {
        ArrayList <Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(5);
        al.add(6);
 
        Integer result=Missing.cal(al);
        System.out.println(result);
        
    }

   
}
