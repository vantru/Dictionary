package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

// then press Enter. You can now see whitespace characters in your code.
public class Main {
   
    public static void main(String[] args) throws IOException {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
         DicManager dicManager = new DicManager();
        var dic = dicManager.GetDic();
        var mainGuid = new MyMainGuid(dic);
    // mainGuid.initScreen();
        //test read data fromslang
       
    }
   
}