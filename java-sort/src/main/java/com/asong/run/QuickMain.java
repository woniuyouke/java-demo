package com.asong.run;

import com.asong.array.ArrayNeedSort;
import com.asong.sort.QuickSort;

public class QuickMain {
    public static void main(String[] args){
        QuickSort quickSort = new QuickSort();
        ArrayNeedSort.sys();
        quickSort.sort(ArrayNeedSort.NEED_SORT_ARR,0,ArrayNeedSort.NEED_SORT_ARR.length-1);
        ArrayNeedSort.sys();
    }
}
