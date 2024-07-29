package ARRAYLIST;
import java.util.*;
public class CommonBetweenArraylist {
    
    public static void main(String args[]){
        ArrayList<Integer> input=new ArrayList<>();
        ArrayList<Integer> input2=new ArrayList<>();
        Scanner in=new Scanner(System.in);
        System.out.println("enter the size of both the  array");
        Integer size=in.nextInt();

        System.out.println("enter the elements in first array:");
        for(int i=0;i<size;i++){
            Integer k=in.nextInt();
            input.add(k);
        }
        System.out.println("enter the elements in first array:");

        for(int i=0;i<size;i++){
            Integer k=in.nextInt();
            input2.add(k);
        }
        boolean arr[]=new boolean[size];

        for(int i=0;i<size;i++){
            arr[i]=false;
        }
       for(int k=0;k<size;k++){
            for(int l=0;l<size;l++){
                if(input.get(k).equals(input2.get(l)))
                {
                    arr[k]=true;

                }
            }
       }
       for(int j=0;j<size;j++){
            if(arr[j]==true){
                System.out.print(input.get(j)+" ");
            }
       }

       


        in.close();

    }
}


