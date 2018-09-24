package com.asong.run;

import com.asong.agency.NeedLovePerson;
import com.asong.agency.Xie;
import com.asong.cglib.CglibProxy;
import net.sf.cglib.core.DebuggingClassWriter;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CglibMain {
    public static void main(String[] args){
        long start = System.currentTimeMillis();
      //for (int i=0;i<500000;i++) {
            NeedLovePerson needLovePerson = (NeedLovePerson) new CglibProxy().getInstance(new Xie());
            needLovePerson.findLove();
       //}
        long end = System.currentTimeMillis();
        long pay = (end - start)/1000;
        System.out.println(start+" 开始"+end+" 结束,花费:"+pay+"秒");

    }
}
