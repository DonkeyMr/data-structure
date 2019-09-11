package com.data.stack;

/**
 * @author liupeng
 * @date 2019/8/26
 */
public class StackTest {

    public static void main(String[] args) {
      // Stack<Integer> stack = new ArrayStack<>();
       Stack<Integer> stack = new LinkedListStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }
}
