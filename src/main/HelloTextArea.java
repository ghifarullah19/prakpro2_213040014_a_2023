/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Pertemuan 2
package main;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class HelloTextArea extends JFrame {
    public HelloTextArea() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel label = new JLabel("Input nama: ");
        label.setBounds(130, 40, 100, 10);
        
        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);
        
        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);
        
        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(130, 150, 100, 100);
        
        button.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e) {
               String nama = textField.getText();
               txtOutput.append("Halo " + nama + "\n");
               textField.setText("");
           }
        });
        
        this.add(label);
        this.add(textField);
        this.add(button);
        this.add(txtOutput);
        
        this.setSize(400, 500);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
           public void run() {
               HelloTextArea helloTextArea = new HelloTextArea();
               helloTextArea.setVisible(true);
           } 
        });
    }
}
