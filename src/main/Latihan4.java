/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;

/**
 *
 * @author ghifarullah19
 */
public class Latihan4 extends JFrame {
    private boolean checkBoxSelected;
    
    public Latihan4() {
        this.checkBoxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel labelHeader = new JLabel("Form Biodata", JLabel.CENTER);
        labelHeader.setBounds(0, 20, 350, 10);
        
        // membuat label untuk input nama
        JLabel labelNama = new JLabel("Nama: ");
        // mengatur ukuran dan letak label
        labelNama.setBounds(15, 40, 350, 10);

        // membuat textfield untuk input nama
        JTextField textFieldNama = new JTextField();
        // mengatur ukuran dan letak input
        textFieldNama.setBounds(15, 60, 350, 30);

        // membuat label untuk input telepon
        JLabel labelTelepon = new JLabel("Nomor HP: ");
        // mengatur ukuran dan letak input
        labelTelepon.setBounds(15, 100, 350, 10);

        // membuat textfield untuk input nama
        JTextField textFieldTelepon = new JTextField();
        // mengatur ukuran dan letak input
        textFieldTelepon.setBounds(15, 120, 350, 30);

        // membuat label untuk input radio button
        JLabel labelRadio = new JLabel("Jenis Kelamin:");
        // mengatur ukuran dan letak label
        labelRadio.setBounds(15, 160, 350, 10);

        // membuat radio button dengan nilai laki-laki dan true
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);
        // mengatur ukuran dan letak radio button
        radioButton1.setBounds(15, 180, 350, 30);

        // membuat radio button dengan nilai perempuan
        JRadioButton radioButton2 = new JRadioButton("Perempuan");
        // mengatur ukuran dan letak radio button
        radioButton2.setBounds(15, 220, 350, 30);

        // instansiasi ButtonGroup dengan nama bg
        ButtonGroup bg = new ButtonGroup();
        // memasukan semua radio button ke bg
        bg.add(radioButton1);
        bg.add(radioButton2);
        
        // membuat checkbox untuk verifikasi WNA
        JCheckBox checkBox = new JCheckBox("Warga Asing");
        // mengatur ukuran dan letak checkbox
        checkBox.setBounds(15, 260, 350, 30);

        JButton button = new JButton("Simpan");
        button.setBounds(15, 300, 100, 40);
        
        JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15,
                350,
                350,
                200);
        
        LatihanMyTableModel tableModel = new LatihanMyTableModel();
        table.setModel(tableModel);

        // memberikan action listener kepada checkbox
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // checkbox bernilai true jika event e yang menampung nilai 1, sebaliknya jika
                // event e tidak menampung nilai 1 maka nilainya akan false
                checkBoxSelected = e.getStateChange() == 1;
            }
        });
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String wna = "";
                String jenisKelamin = "";

                // jika Laki-Laki diklik,
                if (radioButton1.isSelected()) {
                    // maka jenisKelamin akan bernilai Laki-Laki
                    jenisKelamin = radioButton1.getText();
                    // kembalikan radio button ke kondisi semula
                    radioButton1.setSelected(false);
                }
                // jika Perempuan diklik,
                if (radioButton2.isSelected()) {
                    // maka jenisKelamin akan bernilai Perempuan
                    jenisKelamin = radioButton2.getText();
                    // kembalikan radio button ke kondisi semula
                    radioButton2.setSelected(false);
                }
                
                // jika checkBoxSelected bernilai true,
                if (checkBoxSelected) {
                    // string WNA: Ya dimasukan ke textarea
                    wna = "Ya";
                }
                // jika checkBoxSelected bernilai false,
                else {
                    // string WNA: Bukan dimasukan ke textarea
                    wna = "Tidak";
                }

                String nama = textFieldNama.getText();
                String telepon = textFieldTelepon.getText();
                tableModel.add(new ArrayList<>(Arrays.asList(nama, telepon, jenisKelamin, wna)));
                textFieldNama.setText("");
                textFieldTelepon.setText("");
            }
        });
        
        this.add(labelHeader);
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelTelepon);
        this.add(textFieldTelepon);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(checkBox);
        this.add(button);
        this.add(scrollableTable);
        

        this.setSize(400, 600);
        this.setLayout(null);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Latihan4 h = new Latihan4();
                h.setVisible(true);
            }
        });
    }
}
