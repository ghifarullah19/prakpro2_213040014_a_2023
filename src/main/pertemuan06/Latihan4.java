/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 6
// Berada di package main
package main.pertemuan06;

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

// class Latihan4 mewarisi JFrame
public class Latihan4 extends JFrame {
    // Properti checkBoxSlected untuk menyimpan nilai apakah checkBox diklik atau tidak
    private boolean checkBoxSelected;
    
    public Latihan4() {
        // Atur nilai awal checkBoxSelected menjadi false
        this.checkBoxSelected = false;
        // Method untuk menutup frame ketika tombol X ditekan
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Instansiasi JLabel dengan nama labelNama yang diberikan nilai "Form Biodata:" dan diletakan di tengah frame
        JLabel labelHeader = new JLabel("Form Biodata", JLabel.CENTER);
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelHeader.setBounds(0, 20, 350, 10);
        
        // Instansiasi JLabel dengan nama labelNama yang diberikan nilai "Nama:"
        JLabel labelNama = new JLabel("Nama: ");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelNama.setBounds(15, 40, 350, 10);

        // Instansiasi JTextField dengan nama textFieldNama
        JTextField textFieldNama = new JTextField();
        // Atur ukuran panjang dan lebar serta posisi x dan y
        textFieldNama.setBounds(15, 60, 350, 30);

        // Instansiasi JLabel dengan nama labelTelepon yang diberikan nilai "Nomor Telepon:"
        JLabel labelTelepon = new JLabel("Nomor Telepon: ");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelTelepon.setBounds(15, 100, 350, 10);

        // Instansiasi JTextField dengan nama textFieldTelepon
        JTextField textFieldTelepon = new JTextField();
        // Atur ukuran panjang dan lebar serta posisi x dan y
        textFieldTelepon.setBounds(15, 120, 350, 30);

        // Instansiasi JLabel dengan nama labelInput yang diberikan nilai "Jenis Kelamin:"
        JLabel labelRadio = new JLabel("Jenis Kelamin:");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        labelRadio.setBounds(15, 160, 350, 10);

        // Instansiasi JRadioButton dengan nama radioButton1 dengan pesan "Laki-Laki" dan selected dengan nilai true
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);
        // Atur ukuran panjang dan lebar serta posisi x dan y
        radioButton1.setBounds(15, 180, 350, 30);

        // Instansiasi JRadioButton dengan nama radioButton1 dengan pesan "Perempuan"
        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        radioButton2.setBounds(15, 220, 350, 30);

        // Instansiasi ButtonGroup dengan nama bg
        ButtonGroup bg = new ButtonGroup();
        // Masukan radioButton1 ke objek bg
        bg.add(radioButton1);
        // Masukan radioButton2 ke objek bg
        bg.add(radioButton2);
        
        // Instansiasi JCheckBox dengan nama checkBox dengan pesan "Warga Asing"
        JCheckBox checkBox = new JCheckBox("Warga Asing");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        checkBox.setBounds(15, 260, 350, 30);

        // Instansiasi JButton dengan nama button yang diberikan nilai "Simpan"
        JButton button = new JButton("Simpan");
        // Atur ukuran panjang dan lebar serta posisi x dan y
        button.setBounds(15, 300, 100, 40);
        
        // Instansiasi JTable dengan nama table
        JTable table = new JTable();
        // Instansiasi JScrollPane dengan nama scrollableTable yang diberikan ke objek table
        JScrollPane scrollableTable = new JScrollPane(table);
        // Atur ukuran panjang dan lebar serta posisi x dan y
        scrollableTable.setBounds(15,
                350,
                350,
                200);
        
        // Instansiasi LatihanMyTableModel dengan nama tableModel
        LatihanMyTableModel tableModel = new LatihanMyTableModel();
        // Atur model dari table dengan objek tableModel
        table.setModel(tableModel);

        // Menambahkan action listener ke checkBox
        checkBox.addItemListener(new ItemListener() {
            // Method untuk menerima event
            public void itemStateChanged(ItemEvent e) {
                // checkbox bernilai true jika event e yang menampung nilai 1, sebaliknya jika
                // event e tidak menampung nilai 1 maka nilainya akan false
                checkBoxSelected = e.getStateChange() == 1;
            }
        });
        
        // Menambahkan action listener ke button
        button.addActionListener(new ActionListener() {
            // Method untuk menerima event
            public void actionPerformed(ActionEvent e) {
                // Variable wna untuk menyimpan nilai checkBox yang diklik (wna)
                String wna = "";
                // Variable jenisKelamin untuk menyimpan nilai radio button yang diklik (jenis kelamin)
                String jenisKelamin = "";

                // Jika radioButton1 diklik
                if (radioButton1.isSelected()) {
                    // Maka jenisKelamin akan bernilai Laki-Laki
                    jenisKelamin = radioButton1.getText();
                    // Kembalikan radio button ke kondisi semula
                    radioButton1.setSelected(false);
                }
                // Jika radioButton2 diklik
                if (radioButton2.isSelected()) {
                    // Maka jenisKelamin akan bernilai Perempuan
                    jenisKelamin = radioButton2.getText();
                    // Kembalikan radio button ke kondisi semula
                    radioButton2.setSelected(false);
                }
                
                // Jika checkBoxSelected bernilai true
                if (checkBoxSelected) {
                    // string WNA: Ya dimasukan ke textarea
                    wna = "Ya";
                }
                // jika checkBoxSelected bernilai false,
                else {
                    // string WNA: Bukan dimasukan ke textarea
                    wna = "Bukan";
                }

                // Variable nama untuk menyimpan nilai dari objek textFieldNama (nama)
                String nama = textFieldNama.getText();
                // Variable telepon untuk menyimpan nilai dari objek textFieldTelepon (telepon)
                String telepon = textFieldTelepon.getText();
                // Tambahkan variable nama, telepon, jenisKelamin, dan wna ke objek ArrayList dan dikirim lagi ke objek tableModel melalui method add
                tableModel.add(new ArrayList<>(Arrays.asList(nama, telepon, jenisKelamin, wna)));
                // Kembalikan isi textFieldNama ke kondisi kosong
                textFieldNama.setText("");
                // Kembalikan isi textFieldTelepon ke kondisi kosong
                textFieldTelepon.setText("");
            }
        });
        
        // Menambahkan objek labelHeader ke frame
        this.add(labelHeader);
        // Menambahkan objek labelNama ke frame
        this.add(labelNama);
        // Menambahkan objek textFieldNama ke frame
        this.add(textFieldNama);
        // Menambahkan objek labelTelepon ke frame
        this.add(labelTelepon);
        // Menambahkan objek textFieldTelepon ke frame
        this.add(textFieldTelepon);
        // Menambahkan objek labelRadio ke frame
        this.add(labelRadio);
        // Menambahkan objek radioButton1 ke frame
        this.add(radioButton1);
        // Menambahkan objek radioButton2 ke frame
        this.add(radioButton2);
        // Menambahkan objek checkBox ke frame
        this.add(checkBox);
        // Menambahkan objek button ke frame
        this.add(button);
        // Menambahkan objek scrollableTable ke frame
        this.add(scrollableTable);
        
        // Atur ukuran frame menjadi 400 x 600
        this.setSize(400, 600);
        // Atur layout frame menjadi null
        this.setLayout(null);
    }
    
    // Main program
    public static void main(String[] args) {
        // Method invokeLater dari SwingUtilities untuk menjalankan objek Runnable yang berguna menangani event dan update UI
        SwingUtilities.invokeLater(new Runnable() {
            // Override method run dari Runnable
            public void run() {
                // Instansiasi Latihan4 dengan nama h
                Latihan4 h = new Latihan4();
                // Tampilkan objek h dengan method setVisible dan parameternya true
                h.setVisible(true);
            }
        });
    }
}
