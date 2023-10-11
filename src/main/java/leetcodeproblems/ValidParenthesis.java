package leetcodeproblems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {

    //faster, but uses more memory than method 2
    public boolean isValid(String s) {
        Stack<Character> bracketStack = new Stack<>();
        for(char bracket : s.toCharArray()){
            if(bracket == '{' || bracket == '[' || bracket == '('){
                bracketStack.push(bracket);
            } else {
                if(bracketStack.isEmpty()){
                    return false;
                }
                char top = bracketStack.peek();
                if(bracket == '}' && top == '{' || bracket == ']' && top == '[' || bracket == ')' && top == '('){
                    bracketStack.pop();
                } else {
                    return false;
                }
            }
        }
        return bracketStack.isEmpty();
    }

    // Uses less memory but is slightly slower than method above 2 ms vs 1 ms, 40.2mb vs 40.9b
    public boolean isValid2(String s) {
        HashMap<Character, Character> Hmap = new HashMap<Character, Character>();
        Hmap.put(')','(');
        Hmap.put('}','{');
        Hmap.put(']','[');
        Stack<Character> stack = new Stack<Character>();
        for (int idx = 0; idx < s.length(); idx++){

            if (s.charAt(idx) == '(' || s.charAt(idx) == '{' || s.charAt(idx) == '[') {
                stack.push(s.charAt(idx));
                continue;
            }

            if (stack.size() == 0 || Hmap.get(s.charAt(idx)) != stack.pop()) {
                return false;
            }
        }
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }


}
