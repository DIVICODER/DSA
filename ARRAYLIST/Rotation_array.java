package ARRAYLIST;



import java.util.*;

class RotateArray {
    RotateArray(ArrayList<Integer> arr, int rot) {
        int n = arr.size();

        // Calculate the effective rotation (to handle cases where rot > n)
        int effectiveRot = rot % n;

        // Create a new array to store the rotated elements
        ArrayList<Integer> rotatedArray = new ArrayList<>();

        // Add the rotated elements to the new array
        for (int i = effectiveRot; i < n; i++) {
            rotatedArray.add(arr.get(i));
        }

        for (int i = 0; i < effectiveRot; i++) {
            rotatedArray.add(arr.get(i));
        }

        // Print the rotated array
        System.out.println(rotatedArray);
    }
}

public class Rotation_array {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();

        System.out.println("Enter the size of the array:");
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            int k = in.nextInt();
            al.add(k);
        }

        System.out.println("Enter the number of rotations:");
        int rotations = in.nextInt();

        // Create an object of RotateArray to perform rotations
        new RotateArray(al, rotations);

        in.close();
    }
}
