package com.asong.thread.Sort;

/**
 * 冒泡排序
 */
public class BubblingSort implements  Sort{
    public  int[] arrInt = {-3,29,32,2,31,10,33};
    public void sort() {
        for (int i=0;i<arrInt.length;i++){
            for(int j=i+1;j < arrInt.length ;j++){
                int temp;
                if(arrInt[i] > arrInt[j]){
                   temp =  arrInt[i] ;
                   arrInt[i] = arrInt[j];
                   arrInt[j] = temp;
                }
            }
        }
    }
    public void print(){
        StringBuffer buffer = new StringBuffer();
        for (int i : arrInt){
            buffer.append(i+" ");
        }
        System.out.println(buffer.toString());
    }
    public static void main(String[] args){
        Sort sort = new BubblingSort();
        sort.print();
        sort.sort();
        sort.print();
    }
}
