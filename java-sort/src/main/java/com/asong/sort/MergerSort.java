package com.asong.sort;

import com.asong.array.ArrayNeedSort;

/**
 * 归并排序
 */
public class MergerSort {

    public static void sort(int[] arr){
        mergerSort(arr,0,arr.length-1);
    }

    private static void mergerSort(int[] arr,int start,int end){
        int left = start;
        int right = end;
        if(left < right){
            int middle = (left + right)/2;
            //拆分左边
            mergerSort(arr,left,middle);
            //拆分右边
            mergerSort(arr,middle+1,right);
            //归并排序
            merger(arr,left,middle,right);
        }
    }
    private static void merger(int[] arr, int left, int middle,int right) {
        int i=0;
        int j=middle+1;
        int len = middle-left+1;
        int []temp = new int[len];
        int position = left;
        System.arraycopy(arr,left,temp,0,len);
        ArrayNeedSort.sysDesign(arr,left,middle);
        System.out.println("middle:"+middle+"  left:"+left);
        ArrayNeedSort.sysDesign(temp,0,len-1);
        while( i < len && j <= right ){
            if( temp[i] <=  arr[j]){
                arr[position] = temp[i];
                i++;
            }else{
                arr[position]  = arr[j];
                j++;
            }
            position++;
        }
        if( i < len ){
            System.arraycopy(temp,i,arr,position,j-position );
        }
    }
}
