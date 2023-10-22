/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 6
// Berada di package main
package main;

// Import semua class dari java.awt.event
import java.awt.event.*;
// Import semua class dari javax.swing
import javax.swing.*;
// Import semua class dari javax.swing.table
import javax.swing.table.*;
// Import semua class dari java.util
import java.util.*;

/**
 *
 * @author ghifarullah19
 */

// class HelloTable yang mewarisi JFrame
public class HelloTable extends JFrame {
    // Konstruktor
    public HelloTable() {
        // Method untuk menutup frame ketika tombol X ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Instansiasi JLabel dengan nama labelInput yang diberikan nilai "Nama:"
        JLabel labelInput = new JLabel("Nama:");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelInput.setBounds(15, 40, 350, 10);
        
        // Instansiasi JTextField dengan nama textField
        JTextField textField = new JTextField();
        // Atur ukuran panjang dan lebar serta posisi x dan y
        textField.setBounds(15, 60, 350, 30);
        
        // Instansiasi JLabel dengan nama labelInput yang diberikan nilai "Jenis Member:"
        JLabel labelRadio = new JLabel("Jenis Member:");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelRadio.setBounds(15, 100, 350, 10);

        // Instansiasi JRadioButton dengan nama radioButton1 dengan pesan "Silver" dan selected dengan nilai true
        JRadioButton radioButton1 = new JRadioButton("Silver", true);
        // Atur ukuran panjang dan lebar serta posisi x dan y
        radioButton1.setBounds(15, 115, 350, 30);

        // Instansiasi JRadioButton dengan nama radioButton2 dengan pesan "Gold"
        JRadioButton radioButton2 = new JRadioButton("Gold");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        radioButton2.setBounds(15, 145, 350, 30);

        // Instansiasi JRadioButton dengan nama radioButton3 dengan pesan "Platinum"
        JRadioButton radioButton3 = new JRadioButton("Platinum");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        radioButton3.setBounds(15, 175, 350, 30);

        // Instansiasi ButtonGroup dengan nama bg
        ButtonGroup bg = new ButtonGroup();
        // Masukan radioButton1 ke objek bg
        bg.add(radioButton1);
        // Masukan radioButton2 ke objek bg
        bg.add(radioButton2);
        // Masukan radioButton3 ke objek bg
        bg.add(radioButton3);

        // Instansiasi JButton dengan nama button yang diberikan nilai "Simpan"
        JButton button = new JButton("Simpan");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        button.setBounds(15, 205, 100, 40);
        
        // Instansiasi JTable dengan nama table
        JTable table = new JTable();
        // Instansiasi JScrollPane dengan nama scrollableTable yang diberikan ke objek table
        JScrollPane scrollableTable = new JScrollPane(table);
        // Atur ukuran panjang dan lebar serta posisi x dan y
        scrollableTable.setBounds(15,
                250,
                350,
                200);
        
        // Instansiasi MyTableModel dengan nama tableModel
        MyTableModel tableModel = new MyTableModel();
        // Atur model dari table dengan objek tableModel
        table.setModel(tableModel);

        // Menambahkan action listener ke button
        button.addActionListener(new ActionListener() {
            // Method untuk menerima event
            public void actionPerformed(ActionEvent e) {
                // Variable jenisMember untuk menyimpan nilai radio button yang diklik (jenis member)
                String jenisMember = "";

                // Jika radioButton1 diklik
                if (radioButton1.isSelected()) {
                    // Berikan nilai radioButton1 ke jenisMember
                    jenisMember = radioButton1.getText();
                }
                // Jika radioButton2 diklik
                if (radioButton2.isSelected()) {
                    // Berikan nilai radioButton2 ke jenisMember
                    jenisMember = radioButton2.getText();
                }
                // Jika radioButton3 diklik
                if (radioButton3.isSelected()) {
                    // Berikan nilai radioButton3 ke jenisMember
                    jenisMember = radioButton3.getText();
                }

                // Variable nama untuk menyimpan nilai dari objek textField (nama)
                String nama = textField.getText();
                // Tambahkan variable nama dan jenisMember ke objek ArrayList dan dikirim lagi ke objek tableModel melalui method add
                tableModel.add(new ArrayList<>(Arrays.asList(nama, jenisMember)));
                
            }
        });

        // Menambahkan objek labelInput ke frame
        this.add(labelInput);
        // Menambahkan objek textfield ke frame
        this.add(textField);
        // Menambahkan objek labelRadio ke frame
        this.add(labelRadio);
        // Menambahkan objek radioButton1 ke frame
        this.add(radioButton1);
        // Menambahkan objek radioButton2 ke frame
        this.add(radioButton2);
        // Menambahkan objek radioButton3 ke frame
        this.add(radioButton3);
        // Menambahkan objek button ke frame
        this.add(button);
        // Menambahkan objek scrollableTable ke frame
        this.add(scrollableTable);
        
        // Atur ukuran frame menjadi 400 x 500
        this.setSize(400, 500);
        // Atur layout frame menjadi null 
        this.setLayout(null);
    }
    
    // Main program
    public static void main(String[] args) {
        // Method invokeLater dari SwingUtilities untuk menjalankan objek Runnable yang berguna menangani event dan update UI
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi HelloTable dengan nama h
                HelloTable h = new HelloTable();
                // Tampilkan objek h dengan method setVisible dan parameternya true
                h.setVisible(true);
            }
        });
    }
}
