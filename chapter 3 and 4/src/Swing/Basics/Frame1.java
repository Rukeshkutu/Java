package Swing.Basics;

import javax.swing.*;

public class Frame1 extends JFrame {
    Frame1(){
        super("New Frame1");
        setSize(400, 600);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Frame1 frame1 = new Frame1();

    }
}
