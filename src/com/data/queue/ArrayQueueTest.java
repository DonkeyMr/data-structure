package com.data.queue;

/**
 * @author liupeng
 * @date 2019/8/30
 */
public class ArrayQueueTest {

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 5; i++) {
            queue.enqueue(i);
        }
        System.out.println(queue);

        Integer dequeue = queue.dequeue();
        System.out.println(dequeue);
        System.out.println(queue);

    }
}
