package STACK;
import java.util.Scanner;
import java.util.ArrayDeque;


/*we need to check whether (()) is valid or not using stack. example if we give ())) then we need to not valid
 * and we need to display that its not valid to the user.
 */
public class ParanthesisCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Boolean test=true;

        ArrayDeque<Character> parenthesis=new ArrayDeque<>();
        System.out.println("enter the parathesis");
        String par=in.nextLine();

        // we are using par.length() to get the length of the string to iterate that many times
        for(int i=0;i<par.length();i++){

            // we are checking whether it ( or ) if its( then we need to push it in the stack{named}=parenthesis
            if((par.charAt(i)=='(')||(par.charAt(i)=='{')||(par.charAt(i)=='[')){
                parenthesis.push(par.charAt(i));
            }
            else{
                if(parenthesis.isEmpty()){

                    //if stack is already empty if the intput is ()) then we cannot pop the empty stack
                    // in that case we use a checkpointing value called test
                    test=false;
                    break;
                }
                else{
                    switch (parenthesis.peek()) {
                        case '(':
                            if(par.charAt(i)==')')
                                parenthesis.pop();
                            else
                                System.out.println("invalid");
                            break;
                    
                        case '[':
                            if(par.charAt(i)==']')
                                parenthesis.pop();
                            else
                                System.out.println("invalid");
                            break;
                    
                        case '{':
                            if(par.charAt(i)=='}')
                                parenthesis.pop();
                            else
                                System.out.println("invalid");
                            break;
                    
                        default:
                            break;

                        }
                    }  
            }
        }
        System.out.println(parenthesis);

        //it is valid only if the stack is empty as well as they dont try to pop an empty stack.
        if(parenthesis.isEmpty()&&test==true){
            System.out.println("VALID");
        }
        else{
            System.out.println("INVALID");
        }
        
        in.close();
    }
    
}
