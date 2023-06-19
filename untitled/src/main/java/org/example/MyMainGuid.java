/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;

/**
 *
 * @author tru
 */
public class MyMainGuid extends JFrame{
     private  JTextField tfSearch;
    private  JPanel panHistory;
    private  JLabel lbResult;
    private  JPanel panResult;
    private JList<String> definiList;
     MyMainGuid(Map<String, ArrayList<String>> dic) throws IOException{
       
        tfSearch = new JTextField(20);
        tfSearch.setBounds(0, 0, 100, 20);
        tfSearch.addKeyListener(new KeyListener(){
            @Override
            public void keyTyped(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyReleased(KeyEvent e) {
               // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
               DefaultListModel<String> keyResult = new DefaultListModel<String>();
               String textS = tfSearch.getText();
                for (Map.Entry<String, ArrayList<String>> entry : dic.entrySet()) {
                    if (entry.getValue().contains(textS)) {
                        keyResult.addElement(entry.getKey() + "`" + entry.getValue());
                        System.out.println("Result");
                        System.out.println(entry.getKey());
                    }
                }
                changeSearch(keyResult);
            }
        
        });
        JButton btnSeach = new JButton("Tìm");
        btnSeach.setBounds(150, 100, 100, 20);
        btnSeach.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                searchAction( dic);
            }
        });
        
        JPanel panSearch = new JPanel();
        panSearch.setBounds(0, 0, 800, 40);
        panSearch.setBackground(Color.red);
        
        panSearch.setAlignmentX(5);
        panSearch.setAlignmentY(5);
        panSearch.add(tfSearch);
        panSearch.add(btnSeach);
      
        panHistory = new JPanel();
        panHistory.setBounds(510, 45, 300, 600);
        panHistory.setBackground(Color.CYAN);
       // Container con = new Container();
        
        panHistory.setLayout(new BoxLayout(panHistory, 1));
        //panHistory.add(new JLabel("a"));
     
        panResult = new JPanel();
        panResult.setBounds(0, 45, 400, 600);
        panResult.setBackground(Color.BLUE);
        panResult.setLayout(new BoxLayout(panResult, 1));
       // panHistory.add(new JLabel("a"));
        //result search here
        
      JPanel panAction = new JPanel();
        panAction.setBounds(410, 45, 100, 600);
        panAction.setBackground(Color.BLUE);
        panAction.setLayout(new BoxLayout(panAction, 1));
        
        JButton btnAdd = new JButton("Thêm");
        btnAdd.setBounds(0, 100, 70, 20);
        btnAdd.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                addAction();
            }
        });
        panAction.add(btnAdd);
         JButton btnEdit = new JButton("Sửa");
        btnEdit.setBounds(0, 120, 70, 20);
          btnEdit.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                editAction();
            }
        });
        panAction.add(btnEdit);
        JButton btnDel = new JButton("Xóa");
        btnDel.setBounds(0, 140, 70, 20);
          btnDel.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteAction();
            }
        });
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(0, 160, 70, 20);
          btnReset.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                resetAction();
            }
        });
        panAction.add(btnDel);
        panAction.add(btnReset);
        panAction.setLayout(null);
//      pan2.setBackground(Color.BLUE);

        JPanel panBottom = new JPanel();
        panBottom.setBounds(0, 650, 800, 100);
        panBottom.setBackground(Color.YELLOW);
           
        JFrame frame = new JFrame();
      //  frame.setTitle("dictionary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setResizable(false);
        //frame.setLayout(new FlowLayout());
        //init search defini
        
        definiList = new JList<String>();
       // definiList.setBounds(0, 21, 200, 100);
       // definiList.setComponentZOrder(definiList, 100);
       
        definiList.setVisible(true);
        definiList.setSelectedIndex(0);
       // definiList.setModel(colorsName);
        definiList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        definiList.setVisibleRowCount(10);
         JScrollPane definiJScrollPane = new JScrollPane(definiList);
         definiJScrollPane.setBounds(260, 27, 220, 100);
         definiJScrollPane.setBackground(Color.red);
        // definiJScrollPane.setComponentZOrder(definiJScrollPane, 100);
        
        JLayeredPane layered = new JLayeredPane();
        frame.setSize(800,800);
        frame.setLayout(null);
        frame.setContentPane(layered);
        frame.setVisible(true);
        frame.add(panSearch);
        layered.add(panResult, 0);
        layered.add(definiJScrollPane, 0);
       // frame.add(panResult);
        frame.add(panAction);
        frame.add(panHistory);
        frame.add(panBottom);
        //frame.add(definiJScrollPane);
    }

   public void SetDefinition(){
       
   }
    public void searchAction(Map<String, ArrayList<String>> dic) {
        String textvalue = tfSearch.getText(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        panHistory.add(new JLabel(textvalue));
        panHistory.revalidate();
        ArrayList<String> resultDefault = new ArrayList<String>();
        resultDefault.add("No content");
        ArrayList<String> dataresult = dic.get(textvalue.toUpperCase());
         panResult.removeAll();
        if(dataresult != null) {
          
           for(String aString : dataresult){
                panResult.add(new JLabel(aString));
           panResult.revalidate();
           }
        }
        else{
            panResult.add(new JLabel("No content"));
        }
    }
    public void changeSearch(DefaultListModel<String> arrMathList){
        definiList.setModel(arrMathList);
    }
    public void addAction() {
//         String textvalue = tfSearch.getText(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//                panHistory.add(new JLabel(textvalue));
//                panHistory.revalidate();
    }
    public void editAction() {
//         String textvalue = tfSearch.getText(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//                panHistory.add(new JLabel(textvalue));
//                panHistory.revalidate();
    }
    public void deleteAction() {
//         String textvalue = tfSearch.getText(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//                panHistory.add(new JLabel(textvalue));
//                panHistory.revalidate();
    }
      public void resetAction() {
//         String textvalue = tfSearch.getText(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//                panHistory.add(new JLabel(textvalue));
//                panHistory.revalidate();
    }
}
