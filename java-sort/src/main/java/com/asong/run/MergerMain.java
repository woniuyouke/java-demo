package com.asong.run;

import com.asong.array.ArrayNeedSort;
import com.asong.sort.MergerSort;
public class MergerMain {
    public static void main(String[] args){
        ArrayNeedSort.sys();

        MergerSort.sort(ArrayNeedSort.NEED_SORT_ARR);
        ArrayNeedSort.sys();
    }
}
