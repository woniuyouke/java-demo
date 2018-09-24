package com.asong.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * FIFO
 */
public class ListTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("ss");
        list.add("dd");
        for (Iterator<String> iterator = list.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }
    }
}
