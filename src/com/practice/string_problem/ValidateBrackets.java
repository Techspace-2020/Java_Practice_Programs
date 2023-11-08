package com.practice.string_problem;

import java.util.Stack;

public class ValidateBrackets {
    public static void main(String[] args) {
        String str ="(){}[]";
        Boolean result = ValidateString(str);
        System.out.println("Validated brackets:"+ result);
    }
    private static Boolean ValidateString(String str) {
        Stack<Character> stack = new Stack();
        int i;
        for (i = 0; i < str.length() - 1; i++) ;
        char ch = str.charAt(i);

        if (ch == ')')
            if (stack.peek() == '(')
                stack.pop();
            else
                return false;

        else if (ch == '}')
            if (stack.peek() == '{')
                stack.pop();
            else
                return false;

        else if (ch == ']')
            if (stack.peek() == '[')
                stack.pop();
            else
                return false;
        else
            stack.push(ch);

        if (stack.size() == 0)
            return true;

        return false;
    }
}
