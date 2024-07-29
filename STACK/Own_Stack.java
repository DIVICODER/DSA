import java.util.Scanner;

class Stack{
    private int default_size=10;
    private int arr[] =new int[default_size];
    private int ref=-1;

    public boolean Push(int input){
        ref=ref+1;
        if(ref!=arr.length){
            arr[ref]=input;
            return true;
        }
        else{
            ref--;
            return false;
        }
    }
    public int Pop(){
        if(ref==-1){
            return -1; 
        }
        else{
            int p=arr[ref];
            arr[ref]=0;
            ref=ref-1;
            return p;
        }

    }
    public void display(){
        for (int i=0;i<=ref;i++){
            System.out.println(arr[i]);

        }
    }
}

public class Own_Stack {
    public static void main(String[] args) {
    Stack stack = new Stack();
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the number of elements");
    int val = scanner.nextInt();
    scanner.nextLine(); // Consume the newline character

    System.out.println("Enter the elements");
    for (int i = 0; i < val; i++) {
        int k = scanner.nextInt();
        stack.Push(k);
    }
  Integer s= stack.Pop();
  System.out.println(s);
    stack.display();
    scanner.close();
}

}
