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
public class HelloMessageDialog2 extends JFrame {
    public HelloMessageDialog2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        
        JButton button = new JButton("Klik");
        button.setBounds(130,100,100,40);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.ERROR_MESSAGE); // Error
                JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.INFORMATION_MESSAGE); // Info
//                JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.WARNING_MESSAGE); // Warning
//                JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.QUESTION_MESSAGE); // Question
//                JOptionPane.showMessageDialog(HelloMessageDialog2.this, "Halo, Selamat Datang di Praktikum Pemrograman II", "showMessageDialog 2", JOptionPane.PLAIN_MESSAGE); // Plain
            }
        });
        
        this.add(button);
        this.setSize(200,200);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloMessageDialog2 h = new HelloMessageDialog2();
                h.setVisible(true);
            }
        });
    }
}
