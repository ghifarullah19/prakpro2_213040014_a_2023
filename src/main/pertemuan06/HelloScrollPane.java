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
public class HelloScrollPane extends JFrame {
    public HelloScrollPane() {
        // Method untuk menutup frame ketika tombol X ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Instansiasi JLabel dengan nama labelInput yang diberikan nilai "Input Nama:"
        JLabel labelInput = new JLabel("Input Nama:");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelInput.setBounds(130,
                40,
                100,
                30);
        
        // Instansiasi JTextField dengan nama textField
        JTextField textField = new JTextField();
        // Atur ukuran panjang dan lebar serta posisi x dan y
        textField.setBounds(130,
                60,
                100,
                30);
        
        // Instansiasi JButton dengan nama button yang diberi nilai string "Klik"
        JButton button = new JButton("Input");
        // Atur ukuran panjang dan lebar serta posisi x dan y dari button
        button.setBounds(130,100,100,40);
        
        // Instansiasi JTextField dengan nama textField
        JTextArea txtOutput = new JTextArea("");
        // Instansiasi JScrollPane dengan nama scrollableTextArea yang diberikan ke objek txtOutput
        JScrollPane scrollableTextArea = new JScrollPane(txtOutput);
        // Atur ukuran panjang dan lebar serta posisi x dan y dari scrollableTextArea
        scrollableTextArea.setBounds(130,
                150,
                100,
                100);
        // Mengatur scrollableTextArea pada posisi horizontal selalu terlihat/ada
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        // Mengatur scrollableTextArea pada posisi vertikal selalu terlihat/ada
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        
        // Menambahkan action listener ke button
        button.addActionListener(new ActionListener() {
            // Method untuk menerima event
            public void actionPerformed(ActionEvent e) {
                // Variable nama untuk menyimpan nilai dari objek textField
                String nama = textField.getText();
                // txtOutput menambahkan pesan hello ditambah dengan variable nama
                txtOutput.append("Hello " + nama + "\n");
                // Atur textField kembali menjadi kosong
                textField.setText("");
            }
        });
        
        // Menambahkan objek button ke frame
        this.add(button);
        // Menambahkan objek textField ke frame
        this.add(textField);
        // Menambahkan objek labelInput ke frame
        this.add(labelInput);
        // Menambahkan objek scrollableTextArea ke frame
        this.add(scrollableTextArea);
        
        // Atur ukuran frame menjadi 400 x 400
        this.setSize(400,500);
        // Atur layout frame menjadi null
        this.setLayout(null);
    }
    
    // Main program
    public static void main(String[] args) {
        // Method invokeLater dari SwingUtilities untuk menjalankan objek Runnable yang berguna menangani event dan update UI
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi HelloScrollPane dengan nama h
                HelloScrollPane h = new HelloScrollPane();
                // Tampilkan objek h dengan method setVisible dan parameternya true
                h.setVisible(true);
            }
        });
    }
}
