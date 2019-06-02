package com.ylcyouth.algorithm.n01datastructure.n01sparsearray;

/**
 * @author ylcyouth
 * @create 2019/6/2 10:22
 */
public class SparseArrayTest {

    public static void main(String[] args) {

        int[][] chessBoard = new int[11][11];

        chessBoard[1][2] = 1;
        chessBoard[2][3] = 2;
        chessBoard[3][2] = 1;

        System.out.println("现在的数组是：");
        SparseArray.printfComArr(chessBoard);

        System.out.println("转换成稀疏数组：");
        int[][] spsArr = SparseArray.comArrToSpsArr(chessBoard);
        SparseArray.printfSpsArr(spsArr);

        System.out.println("还原数组：");
        int[][] comArr = SparseArray.spsArrToComArr(spsArr);
        SparseArray.printfComArr(comArr);
    }
}
