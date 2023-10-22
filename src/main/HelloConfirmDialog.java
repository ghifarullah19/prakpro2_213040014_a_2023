/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 6
// Berada di package main
package main;

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
public class HelloConfirmDialog extends JFrame {
    public HelloConfirmDialog() {
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
                // Variable confirmation untuk menyimpan confirm dialog pada komponen yang dari paramter 1, dengan pesan pada parameter 2, 
                // title dari confirm dialog pada parameter 3, dan tipe confirm dialog pada parameter 4
                int confirmation = JOptionPane.showConfirmDialog(HelloConfirmDialog.this, "Apakah anda yakin ingin keluar dari aplikasi?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                
                // Jika confirmation berinilai opsi yes
                if (confirmation == JOptionPane.YES_OPTION) {
                    // Maka frame akan diclose
                    System.exit(0);
                }
                // Jika confirmation nilai opsi no
                else {
                    // Tampilkan message dialog pada komponen dari parameter 1 dan pesan pada parameter 2
                    JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda menekan tambal No");
                }
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
                // Instansiasi HelloConfirmDialog dengan nama h
                HelloConfirmDialog h = new HelloConfirmDialog();
                // Tampilkan objek h dengan method setVisible dan parameternya true
                h.setVisible(true);
            }
        });
    }
}
