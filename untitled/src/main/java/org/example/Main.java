package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
     
        JTextField tfSearch = new JTextField(20);
        tfSearch.setBounds(0, 0, 100, 20);
        JButton btnSeach = new JButton("Button");
        btnSeach.setBounds(150, 100, 100, 20);
        
        JPanel panSearch = new JPanel();
        panSearch.setBounds(0, 0, 800, 40);
        panSearch.setBackground(Color.red);
        
        panSearch.setAlignmentX(5);
        panSearch.setAlignmentY(5);
        panSearch.add(tfSearch);
        panSearch.add(btnSeach);
      
        JPanel panHistory = new JPanel();
        panHistory.setBounds(510, 45, 300, 600);
        panHistory.setBackground(Color.CYAN);
        
        JPanel panResult = new JPanel();
        panResult.setBounds(0, 45, 500, 600);
        panResult.setBackground(Color.BLUE);
        JButton btnAdd = new JButton("Button");
        btnAdd.setBounds(150, 100, 100, 20);
        panResult.add(btnAdd);
//      pan2.setBackground(Color.BLUE);

        JPanel panBottom = new JPanel();
        panBottom.setBounds(0, 650, 800, 100);
        panBottom.setBackground(Color.YELLOW);
       // panBody.add(panSearch);
      //  panBody.add(panHistory);
           
        JFrame frame = new JFrame();
      //  frame.setTitle("dictionary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setResizable(false);
        //frame.setLayout(new FlowLayout());
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(panSearch);
        frame.add(panResult);
        frame.add(panHistory);
        frame.add(panBottom);
        //frame.add(panResult);
        
    }
}