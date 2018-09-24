package com.asong.thread;

/**
 * java是值传递，如果入参为基本类型，则为变量副本，如果为引用类型，则为引用指向内存的地址的副本
 */
public class CiteTest {
    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 2;
        swap(a, b);
        String as = "xs";
        String bs="ys";
        swapString(as,bs);
        NewObject objectA = new NewObject("a");
        NewObject objectB = new NewObject("b");
        swapObject(objectA,objectB);
        System.out.println("a:" + a + " b:" + b);
        System.out.println("as："+as+" bs:"+bs);
        objectA.sys();
        objectB.sys();
    }
    private static void swapObject(NewObject objectA, NewObject objectB) {
        NewObject temp  = objectA;
        objectA = objectB;
        objectA = temp;
    }
    private static void swapString(String as, String bs) {
        String temp = as;
        as = bs;
        bs = temp;
    }
    public static void swap(Integer x, Integer y) {
        Integer temp = x;
        x = y;
        y = temp;
    }

}
class NewObject{
    public String object;
    public NewObject(String object){
        this.object = object;
    }
    public void sys(){
        System.out.println(this.object);
    }
}
