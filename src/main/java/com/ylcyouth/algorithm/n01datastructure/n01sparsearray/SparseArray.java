package com.ylcyouth.algorithm.n01datastructure.n01sparsearray;

/**
 * @author ylcyouth
 * @create 2019/6/1 19:20
 *
 * // 2019-6-2 09:43:25
 * // 2019-6-2 10:21:52
 */
public class SparseArray {


    /**
     * @param comArr
     * @return
     *
     * 假设comArr二维数组每一行的长度都是相等的
     */
    public static int[][] comArrToSpsArr(int[][] comArr) {

        //计算数组中非0元素的个数
        int sum = 0;
        for (int i = 0; i < comArr.length; i++) {
            for (int j = 0; j < comArr[i].length; j++) {
                if (comArr[i][j] != 0) {
                    sum ++;
                }
            }
        }

        //根据非0元素的个数创建稀疏数组
        int[][] spsArr = new int[sum+1][3];

        //保存稀疏数组的第1行
        spsArr[0][0] = comArr.length;
        spsArr[0][1] = comArr[0].length;
        spsArr[0][2] = sum;

        //遍历数组把非0元素存到稀疏数组
        int count = 0;
        for (int i = 0; i < comArr.length; i++) {
            for (int j = 0; j < comArr[i].length; j++) {
                if (comArr[i][j] != 0) {
                    count ++;
                    spsArr[count][0] = i;
                    spsArr[count][1] = j;
                    spsArr[count][2] = comArr[i][j];
                }
            }
        }

        return spsArr;
    }


    /**
     *
     * @param spsArr
     * @return
     */
    public static int[][] spsArrToComArr(int[][] spsArr) {

        //先拿到原来数组的行，列，根据行列创建一个数组
        int[][] comArr = new int[spsArr[0][0]][spsArr[0][1]];

        //遍历稀疏数组，把其中的元素放到数组中
        for (int i = 1; i < spsArr.length; i++) {
            comArr[spsArr[i][0]][spsArr[i][1]] = spsArr[i][2];
        }

        return comArr;
    }


    /**
     *
     * @param spsArr
     */
    public static void printfSpsArr(int[][] spsArr) {
        System.out.println("稀疏数组是：");
        for (int[] ints : spsArr) {
            System.out.printf("%d\t%d\t%d\t\n", ints[0], ints[1], ints[2]);
        }
    }

    /**
     *
     * @param comArr
     */
    public static void printfComArr(int[][] comArr) {
        System.out.println("数组是：");
        for (int[] row : comArr) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
    }
}
