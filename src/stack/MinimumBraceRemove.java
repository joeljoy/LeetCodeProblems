package stack;

import java.util.HashSet;
import java.util.Stack;

public class MinimumBraceRemove {

    public String minRemoveToMakeValid(String s) {
        HashSet<Integer> set = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    set.add(i);
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            set.add(stack.pop());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(i)) {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "lee(t(c)o)de)";
        String s2 = "a)b(c)d";
        String s3 = "))((";
        String s4 = "(a(b(c)d)";

        MinimumBraceRemove braceRemove = new MinimumBraceRemove();
        System.out.println(braceRemove.minRemoveToMakeValid(s1));
        System.out.println(braceRemove.minRemoveToMakeValid(s2));
        System.out.println(braceRemove.minRemoveToMakeValid(s3));
        System.out.println(braceRemove.minRemoveToMakeValid(s4));
    }
}
