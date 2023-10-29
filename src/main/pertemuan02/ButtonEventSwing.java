/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

//Pertemuan 2
package main.pertemuan02;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class ButtonEventSwing extends JFrame {
    public ButtonEventSwing() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
        ImageIcon icon = new ImageIcon("D:\\Personal\\ghifarullah19\\Code\\BroCode\\JavaGUI\\src\\like.png");
        
        JLabel label = new JLabel("Hello World");
        label.setBounds(130, 40, 400, 50);
        
        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Halo Pemrograman II");
                label.setIcon(icon);
            }
        });
        
        this.add(button);
        this.add(label);
        
        this.setSize(400, 500);
        this.setLayout(null);
    }
    
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ButtonEventSwing buttonEvent = new ButtonEventSwing();
                buttonEvent.setVisible(true);
            }
        });
    }
}
