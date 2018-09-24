package com.asong.sort;

/**
 * 排序
 * 从左往右依次递减
 * 以第一个位置的值为最大值，逐次与后面的值比较，如小于则交换，大于等于则继续，一轮比玩，则第一个位置为最大值，再从第二个位置开始。
 * 时间复杂度O(n2)
 * 空间复杂度O(1)
 * 稳定的算法
 */
public class BubblingSort implements  Sort{
    public void sort(int[] arr) {
        int len = arr.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if((arr[i] > arr[j])){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
