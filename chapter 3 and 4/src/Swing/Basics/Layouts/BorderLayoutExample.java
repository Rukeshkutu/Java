package Swing.Basics.Layouts;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();

        JButton jButton1 = new JButton("CENTER");
        JButton jButton2 = new JButton("EAST | LINE END");
        JButton jButton3 = new JButton("WEST | LINE START");
        JButton jButton4 = new JButton("NORTH | PAGE START");
        JButton jButton5 = new JButton("SOUTH| PAGE END");

//        SET LAYOUT
        BorderLayout borderLayout = new BorderLayout();
        jFrame.setLayout(borderLayout);

//        add buttons to frame

//        jFrame.add(jButton1, BorderLayout.CENTER);
//        jFrame.add(jButton2, BorderLayout.EAST);
//        jFrame.add(jButton3, BorderLayout.WEST);
//        jFrame.add(jButton4, BorderLayout.NORTH);
//        jFrame.add(jButton5, BorderLayout.SOUTH);

        jFrame.add(jButton1, BorderLayout.CENTER);
        jFrame.add(jButton2, BorderLayout.LINE_END);
        jFrame.add(jButton3, BorderLayout.LINE_START);
        jFrame.add(jButton4, BorderLayout.PAGE_START);
        jFrame.add(jButton5, BorderLayout.PAGE_END);




        jFrame.setVisible(true);
        jFrame.setSize(500, 500);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
