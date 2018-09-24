package com.asong.array;

public class ArrayNeedSort {

    public static int[] NEED_SORT_ARR = {1,9,12,4,4354325,2,-12,-45,232323,5,2};

    public static void sys(){
        StringBuffer buffer = new StringBuffer().append(":");
        for(int i=0;i<NEED_SORT_ARR.length;i++){
            buffer.append(NEED_SORT_ARR[i]).append(" ");
        }
        System.out.println(buffer.toString());
    }

    public static void sysDesign(int[] arr,int start,int end){
        StringBuffer buffer = new StringBuffer();
        for(int a=start;a<= end;a++){
            buffer.append(arr[a]+" ");
        }
        System.out.println(buffer.toString());
    }
}
