package com.asong.calculator.run;

import com.asong.calculator.construction.BaseCal;
import com.asong.calculator.construction.CalImpl;



public class CalMain {
    public static void main(String[] args){
        BaseCal cal = new CalImpl();
        String exp = "(12*23.5)/(3*2)";
        cal.invoke(exp);

    }
}
