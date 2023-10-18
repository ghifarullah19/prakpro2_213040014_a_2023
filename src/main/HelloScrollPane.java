/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class HelloScrollPane extends JFrame {
    public HelloScrollPane() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelInput = new JLabel("Input Nama:");
        labelInput.setBounds(130,
                40,
                100,
                30);
        
        JTextField textField = new JTextField();
        textField.setBounds(130,
                60,
                100,
                30);
        
        JButton button = new JButton("Klik");
        button.setBounds(130,100,100,40);
        
        JTextArea txtOutput = new JTextArea("");
        JScrollPane scrollableTextArea = new JScrollPane(txtOutput);
        scrollableTextArea.setBounds(130,
                150,
                100,
                100);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                txtOutput.append("Hello " + nama + "\n");
                textField.setText("");
            }
        });
        
        this.add(button);
        this.add(textField);
        this.add(labelInput);
        this.add(scrollableTextArea);
        this.setSize(400,500);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloScrollPane h = new HelloScrollPane();
                h.setVisible(true);
            }
        });
    }
}
