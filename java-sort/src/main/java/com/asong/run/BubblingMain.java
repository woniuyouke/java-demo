package com.asong.run;

import com.asong.array.ArrayNeedSort;
import com.asong.sort.BubblingSort;
import com.asong.sort.Sort;

/**
 * 冒泡排序
 */
public class BubblingMain {
    public static void main(String[] args) {
        ArrayNeedSort.sys();
        Sort sort = new BubblingSort();
        sort.sort(ArrayNeedSort.NEED_SORT_ARR);
        ArrayNeedSort.sys();
    }
}
