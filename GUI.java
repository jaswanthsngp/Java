import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

import java.awt.*;
import java.util.*;

class Main{
    public static void main(String[] args) {
        JFrame frame= new JFrame("GUI with Java");
        frame.setSize(900,600);
        JButton button1= new JButton("This is a button");
        JButton button2= new JButton("This is a button");
        button1.setSize(30, 15);
        button2.setSize(30, 15);
        frame.getContentPane().add(BorderLayout.NORTH,button1);
        frame.getContentPane().add(BorderLayout.SOUTH, button2);
        frame.setVisible(true);
    }
}