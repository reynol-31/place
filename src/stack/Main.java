package stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        System.out.println(s.peek());
        System.out.println(s);
    }
}
