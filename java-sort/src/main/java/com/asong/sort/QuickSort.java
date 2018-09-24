package com.asong.sort;


import com.asong.array.ArrayNeedSort;

public class QuickSort {
    private  int count = 0;
    public void sort(int[] arr, int low, int high) {
        int key;

        if (high > low) {
            key  = partition(arr,low,high);
            System.out.println("key:"+key);
            System.out.println("low:"+low+" high:"+high);
            sort(arr, low, key -1 );
            sort(arr, key + 1, high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        count++;
        System.out.println("count:"+count);
        int left = low;
        System.out.println("low:"+low);
        int right = high;
        //1.取枢轴点arr[0]，记作pivot
        //2.左边起始点i,右边起始点j
        //3.j--向左寻找比pivot大的数，找到与arr[i]互换，i++向右寻找比pivot小的数,与arr[j]互换，直到i>j
        //4.递归
        int pivot = arr[low];
        while (left < right) {
            while (left <= high  && arr[left] <= pivot  ) {
                left++;
            }
            while (right >= low  && arr[right] > pivot  ) {
                right--;
            }
            if (left < right) {
                int temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }
        arr[low] = arr[right];
        arr[right] = pivot;
        ArrayNeedSort.sys();
        return right;
    }
}
