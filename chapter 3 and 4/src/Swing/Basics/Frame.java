package Swing.Basics;

import javax.swing.*;

public class Frame {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("New Frame");

        jFrame.setSize(500, 600);
        jFrame.setVisible(true);
        jFrame.setLayout(null);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }
}
