package com.asong.run;

import com.asong.agency.Man;
import com.asong.agency.Person;
import com.asong.principal.GoBetween;
import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CommonMain {

    public static void main(String[] args){
           // System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
            Person person = (Person) new GoBetween(new Man()).getInstance();
            System.out.println(person.getClass());
            person.findObject();


    }
}
