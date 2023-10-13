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
public class HelloInput extends JFrame {
    public HelloInput() {
        JLabel label = new JLabel("Input nama: ");
        label.setBounds(130, 40, 100, 10);

        JTextField textField = new JTextField();
        textField.setBounds(130, 60, 100, 30);

        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        JLabel labelOutput = new JLabel("");
        labelOutput.setBounds(130, 150, 100, 10);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textField.getText();
                labelOutput.setText("Halo " + nama);
            }
        });

        this.add(label);
        this.add(textField);
        this.add(button);
        this.add(labelOutput);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloInput helloInput = new HelloInput();
                helloInput.setVisible(true);
            }
        });
    }
}
