package STACK;
// import java.util.ArrayDeque;
import java.util.*;
import java.util.Scanner;

public class ReverseUsingStack {
    public static void main(String[] args) {
        

    //creating a object for the  hashset
        ArrayDeque <Integer> stack=new ArrayDeque<>();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        Integer val=in.nextInt();

        //
        System.out.println("Enter the elements");
        for(int i=0;i<val;i++){
            Integer k=in.nextInt();
            //here we are adding the elements in the stack using the addfirst 
            // we can use addfirst or push to push the values to the stack
           
            stack.push(k);
        }
        //here we are using the condition- is the stack is not empty then only the stack will be executed.
        while(!stack.isEmpty()){
        System.out.print(stack.pop()+" ");
        }
        in.close();
    }
}
