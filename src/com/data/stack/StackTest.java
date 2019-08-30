package com.data.stack;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class StackTest {

    public static void main(String[] args) {
        ArrayStack<Integer> stack = new ArrayStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        String s = null;
        char[] chars = s.toCharArray();

    }
}
