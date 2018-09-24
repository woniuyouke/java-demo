package com.asong.run;



import java.applet.AppletStub;

public class ClassLoaderMain {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoaderMain.class.getClassLoader();
        ClassLoader parentClassLoader = classLoader.getParent();
        ClassLoader grandParentClassLoader = parentClassLoader.getParent();
        System.out.println(classLoader);
        System.out.println(parentClassLoader);
        System.out.println(grandParentClassLoader);
        System.out.println(AppletStub.class.getClassLoader());
        Class clazz1= Class.forName("com.asong.run.App",true,classLoader);
        Class clazz2= Class.forName("com.asong.run.App",true,classLoader);
        System.out.println(clazz1);
        System.out.println(clazz2);
        Class objectClazz = Class.forName("java.lang.Object",true,classLoader);
        Class objectClazz2 = Class.forName("java.lang.Object",true,grandParentClassLoader);
        System.out.println(objectClazz);
        System.out.println(objectClazz2);
    }
}
