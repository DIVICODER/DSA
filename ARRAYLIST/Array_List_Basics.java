package ARRAYLIST;
import java.util.*;

public class Array_List_Basics {
    public static void main(String[] args) {
        
        // CREATING
        System.out.println("WE ARE CREATING AN ARRAYLIST FOR STORING NAMES");
        ArrayList<String> al =new ArrayList<>();


        // ADDING
        System.out.println("WE ARE ADDING NAMES IN THE ARRAYLIST");
        al.add("ALICE");
        al.add("BOB");
        al.add("SAFARI");
        al.add("JOHN");

         //READING - it wont display if you just give al.get(index)- we need to place the output in an variable
        System.out.println("WE ARE NOW READING THE NAMES IN THE ARRAYLIST");
        String s1=al.get(0);
        String s2=al.get(1);
        String s3=al.get(2);
        String s4=al.get(3);

        System.out.println("WE ARE DISPLAYING THE NAMES TO THE USER IN THE ARRAYLIST");
        // now we are displaying the output to the user using the variable.
        System.out.println(s1+" "+s2+" "+s3+" "+s4);

        //UPDATE THE ELEMENT 
        System.out.println("WE ARE UPDATING  IN THE ARRAYLIST");
        String x=al.set(1, "jik");
        al.set(0, s2);
        boolean r=al.remove(s4);
        System.out.println(al);
        System.out.println(r);
        System.out.println(x);


    }
}
