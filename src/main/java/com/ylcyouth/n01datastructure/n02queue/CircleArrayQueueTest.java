package com.ylcyouth.n01datastructure.n02queue;

import java.util.Scanner;

/**
 * @author ylcyouth
 * @create 2019/6/2 11:59
 */
public class CircleArrayQueueTest {
    public static void main(String[] args) {

        CircleArrayQueue queue = new CircleArrayQueue(5);

        char key;

        Scanner scanner = new Scanner(System.in);

        boolean loop = true;

        System.out.println("程序开始~~~");

        while (loop) {
            System.out.println("p(print):打印队列");
            System.out.println("e(exit):退出程序");
            System.out.println("a(add):添加数据到队列");
            System.out.println("g(get):取出队列数据");
            System.out.println("s(size):查看现在队列中有多少个元素");
            System.out.println("h(h):查看队头数据");
            System.out.println("f(full):队列是否满了");
            System.out.println("k(em):队列是否为空");

            key = scanner.next().charAt(0);

            switch (key) {
                case 'p':
                    queue.printfQueue();
                    break;
                case 'e':
                    scanner.close();
                    loop = false;
                    break;
                case 'a':
                    System.out.println("请输入要往队列中添加的数");
                    int input = scanner.nextInt();
                    queue.addQueue(input);
                    break;
                case 'g':
                    try {
                        int result = queue.getQueue();
                        System.out.printf("取出的数据是%d\n", result);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 's':
                    System.out.printf("队列的中数据的个数为%d个\n", queue.size());
                    break;
                case 'h':
                    try {
                        int result = queue.headQueue();
                        System.out.printf("队头的数据是%d\n", result);
                    } catch (RuntimeException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 'f':
                    System.out.printf("队列满：%s\n", queue.isFull());
                    break;
                case 'k':
                    System.out.printf("队列空：%s\n", queue.isEmpty() == true ? "true" : "false");
                    break;
                default:
                    break;
            }
        }
        System.out.println("程序退出~~~");
    }
}
