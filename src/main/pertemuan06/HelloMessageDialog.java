/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 6
// Berada di package main
package main.pertemuan06;

// Import semua class dari java.awt
import java.awt.*;
// Import semua class dari java.awt.event
import java.awt.event.*;
// Import semua class dari javax.swing
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class HelloMessageDialog extends JFrame {
    public HelloMessageDialog() {
        // Method untuk menutup frame ketika tombol X ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Method untuk mengatur layout menjadi FlowLayout
        this.setLayout(new FlowLayout());
        
        // Instansiasi JButton dengan nama button yang diberi nilai string "Klik"
        JButton button = new JButton("Klik");
        // Atur ukuran panjang dan lebar serta posisi x dan y dari button
        button.setBounds(130,100,100,40);
        
        // Menambahkan action listener ke button
        button.addActionListener(new ActionListener() {
            // Method untuk menerima event
            public void actionPerformed(ActionEvent e) {
                // Menampilkan messageDialog dari JOptionPane ke class ini dengan isi pesan pada parameter kedua
                JOptionPane.showMessageDialog(HelloMessageDialog.this, "Halo, Selamat Datang di Praktikum Pemrograman II");
            }
        });
        
        // Menambah button ke frame
        this.add(button);
        // Atur ukuran frame dengan ukuran 200 x 200
        this.setSize(200,200);
    }
    
    // Main program
    public static void main(String[] args) {
        // Method invokeLater dari SwingUtilities untuk menjalankan objek Runnable yang berguna menangani event dan update UI
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi HelloMessageDialog dengan nama h
                HelloMessageDialog h = new HelloMessageDialog();
                // Tampilkan objek h dengan method setVisible dan parameternya true
                h.setVisible(true);
            }
        });
    }
}
