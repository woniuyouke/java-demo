package com.asong.thread;


import java.lang.reflect.Field;

/**
 * Integer的自动封箱，拆箱
 */
public class CiteForIntegerTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
     Integer a = 1;
     Integer b =2;
     Integer c =128;
     Integer d = 128;
     System.out.println(c==d);
     System.out.println("before: a:"+a+"  b:"+b);
     swap(a,b);
     System.out.println("after:a:"+a+"  b:"+b);
    }
    /**
     * @param a
     * @param b
     * @throws NoSuchFieldException
     */
    private static void swap(Integer a, Integer b) throws NoSuchFieldException, IllegalAccessException {
        Field field = Integer.class.getDeclaredField("value");
        field.setAccessible(true);
        //Integer temp = b.intValue();
        Integer temp = new Integer(b.intValue());
        System.out.println("1-》temp："+temp);
        //将b的值改成1
        field.set(b,a.intValue());
        System.out.println("2-》temp："+temp);
        field.set(a,temp);
    }
}
