package com.ylcyouth.n01datastructure.n02queue;

/**
 * @author ylcyouth
 * @create 2019/6/2 11:59
 *
 * isFull ->
 */
public class CircleArrayQueue {
    /**
     * 队头位置
     */
    private int front;
    /**
     * 队头位置的后一个位置
     */
    private int rear;
    private int maxSize;
    private int[] arr;

    public static final String FULL_TIP = "队列已满，不能再添加数据";
    public static final String EMPTY_TIP = "队列为空，没有数据";

    public CircleArrayQueue(int maxSize) {
        front = 0;
        rear = 0;
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println(FULL_TIP);
            return;
        }
        arr[rear] = n;
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException(EMPTY_TIP);
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException(EMPTY_TIP);
        }
        return arr[front];
    }

    public int size() {
        return rear - front;
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }


    public boolean isEmpty() {
        return front == rear;
    }

    public void printfQueue() {
        if (isEmpty()) {
            System.out.println(EMPTY_TIP);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("arr[%d]=%d\n", i, arr[i]);
        }
    }
}
