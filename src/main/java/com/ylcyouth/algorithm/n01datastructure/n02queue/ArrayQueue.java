package com.ylcyouth.algorithm.n01datastructure.n02queue;

/**
 * @author ylcyouth
 * @create 2019/6/2 10:45
 */
public class ArrayQueue {

    private int front;
    private int rear;
    private int maxSize;
    private int[] arr;

    public static final String FULL_TIP = "队列已满，不能再添加数据";
    public static final String EMPTY_TIP = "队列为空，没有数据";

    public ArrayQueue(int maxSize) {
        front = -1;
        rear = -1;
        this.maxSize = maxSize;
        arr = new int[this.maxSize];
    }

    public void addQueue(int n) {
        if (isFull()) {
            System.out.println(FULL_TIP);
            return;
        }
        rear++;
        arr[rear] = n;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException(EMPTY_TIP);
        }
        front++;
        return arr[front];
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException(EMPTY_TIP);
        }
        return arr[front+1];
    }

    public int size() {
        return rear - front;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
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
