package C_09082024.Collections;

import java.util.Stack;

public class Lab97 {
    public static void main(String[] args) {

        //Stack
        Stack<String> stack=new Stack<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");
        stack.push("D");

        System.out.println(stack);
//look at the top of the stack
        System.out.println(stack.peek());
        System.out.println(stack);

        //retrieve the recent element
        System.out.println(stack.pop());
        System.out.println(stack);
    }
}
