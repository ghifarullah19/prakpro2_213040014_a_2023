/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// pertemuan 4
package main.pertemuan04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class HelloBorderLayout extends JFrame {
    public HelloBorderLayout() {
        // memberikan perintah ketika tombol X pada frame di klik, maka GUI akan diclose
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // membuat label pertanyaan
        JLabel labelPertanyaan = new JLabel("Apakah ibukota Indonesia");
        // membuat label hasil
        JLabel labelHasil = new JLabel("Jawab pertanyaan di atas");

        // membuat button untuk jawaban Jakarta
        JButton buttonA = new JButton("Jakarta");
        // membuat button untuk jawaban Bandung
        JButton buttonB = new JButton("Bandung");
        // membuat button untuk jawaban Surabaya
        JButton buttonC = new JButton("Surabaya");

        // memberikan action listener ke buttonA (Jakarta)
        buttonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // jika buttonA diklik, maka labelHasil akan berisi pesan benar
                labelHasil.setText("Jawaban anda benar");
            }
        });

        // memberikan action listener ke buttonB (Bandung)
        buttonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // jika buttonB diklik, maka labelHasil akan berisi pesan salah
                labelHasil.setText("Jawaban anda salah");
            }
        });

        // memberikan action listener ke buttonC (Surabaya)
        buttonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // jika buttonC diklik, maka labelHasil akan berisi pesan salah
                labelHasil.setText("Jawaban anda salah");
            }
        });

        // menambahkan seluruh elemen ke frame dengan posisi yang diberikan
        this.add(labelPertanyaan, BorderLayout.NORTH);
        this.add(labelHasil, BorderLayout.SOUTH);
        this.add(buttonA, BorderLayout.WEST);
        this.add(buttonB, BorderLayout.CENTER);
        this.add(buttonC, BorderLayout.EAST);

        // mengatur ukuran dari frame menjadi 400 x 200
        this.setSize(400, 200);
    }

    // fungsi main
    public static void main(String[] args) {
        // fungsi java swing yang dioverride untuk menjalankan JavaGUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // instansiasi java class
                HelloBorderLayout h = new HelloBorderLayout();
                // objek tersebut ditampilkan ke frame
                h.setVisible(true);
            }
        });
    }
}
