package com.wlper.temp.data;

import java.util.HashMap;
import java.util.Stack;

/**
 * @ClassName: TestStack
 * @Package: com.xjidp.hrsaas.temp.data
 * @Description: TODO
 * @Author: Thunder
 * @Date: Created in 2023-04-20 10:19
 * @Version: V1.0.0
 */
public class TestStack {
    public boolean isValid(String s){
        // 括号之间的对应规则
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "[]({)}";
        TestStack testStack = new TestStack();
        System.out.println(testStack.isValid(s));
        StringBuilder stringBuilder = new StringBuilder(s);
        String string = stringBuilder.reverse().toString();
        System.out.println(string);
    }
}
