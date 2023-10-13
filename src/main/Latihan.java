/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Pertemuan 2
package main;

import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class Latihan extends JFrame {

    Latihan() {

        JLabel labelJudul = new JLabel("Aplikasi Input Nama dan Telepon");
        labelJudul.setBounds(100, 10 + 10, 300, 20);
        labelJudul.setFont(new Font("", Font.BOLD, 14));

        JLabel labelNama = new JLabel("Nama:");
        labelNama.setBounds(130, 40 + 20, 50, 15);

        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(190, 35 + 20, 100, 30);

        JLabel labelTelepon = new JLabel("Telepon: ");
        labelTelepon.setBounds(130, 80 + 20, 100, 15);

        JTextField textFieldTelepon = new JTextField();
        textFieldTelepon.setBounds(190, 75 + 20, 100, 30);

        JButton buttonKirim = new JButton("Kirim");
        buttonKirim.setBounds(130, 115 + 20, 160, 40);

        JTextArea textArea = new JTextArea("");
        textArea.setBounds(130, 160 + 20, 160, 100);

        buttonKirim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String hasil = textFieldNama.getText() + ": " + textFieldTelepon.getText() + "\n-----\n";
                textArea.append(hasil);
                textFieldNama.setText("");
                textFieldTelepon.setText("");
            }
        });

        this.add(labelJudul);

        this.add(labelNama);
        this.add(textFieldNama);

        this.add(labelTelepon);
        this.add(textFieldTelepon);

        this.add(buttonKirim);
        this.add(textArea);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan latihan = new Latihan();
                latihan.setVisible(true);
            }
        });
    }
}
