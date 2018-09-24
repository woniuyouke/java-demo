package com.asong.event;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUIEvent {
    public static void main(String[] args){
        JFrame jFrame = new JFrame("GUI-桌面事件");

        jFrame.setBounds(100,100,400,400);
        jFrame.setVisible(true);
        jFrame.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("窗口被点击");
                super.mouseClicked(e);
            }
        });
        jFrame.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                super.windowClosed(e);
                System.out.println("窗口关闭，程序结束");
                System.exit(0);
            }
            public void windowClosing(WindowEvent e){
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
