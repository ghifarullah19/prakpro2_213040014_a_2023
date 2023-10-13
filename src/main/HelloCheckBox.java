/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 3
package main;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class HelloCheckBox extends JFrame {
    // menyiapakan variabel untuk menampung apakah checkbox telah diklik
    private boolean checkBoxSelected;

    public HelloCheckBox() {
        // checkBoxSelected diberi nilai awal false
        this.checkBoxSelected = false;
        // memberikan perintah bahwa ketika tombol window X ditekan, maka JavaGUI akan
        // diclose
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // membuat label untuk input nama
        JLabel labelInput = new JLabel("Input Nama: ");
        // mengatur ukuran dan letak label
        labelInput.setBounds(15, 40, 350, 10);

        // membuat textfield untuk input nama
        JTextField textField = new JTextField();
        // mengatur ukuran dan letak input
        textField.setBounds(15, 60, 350, 30);

        // membuat checkbox untuk syarat dan ketentuan
        JCheckBox checkBox = new JCheckBox("Saya menyetujui syarat dan ketentuan yang berlaku");
        // mengatur ukuran dan letak checkbox
        checkBox.setBounds(15, 100, 350, 30);

        // membuat button untuk simpan data
        JButton button = new JButton("Simpan");
        // mengatur ukuran dan letak button
        button.setBounds(15, 150, 100, 40);

        // membuat textarea untuk output data
        JTextArea textArea = new JTextArea("");
        // mengatur ukuran dan letak textarea
        textArea.setBounds(15, 200, 350, 100);

        // memberikan action listener kepada checkbox
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                // checkbox bernilai true jika event e yang menampung nilai 1, sebaliknya jika
                // event e tidak menampung nilai 1 maka nilainya akan false
                checkBoxSelected = e.getStateChange() == 1;
            }
        });

        // memberikan action listener kepada button simpan
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // jika variabel checkBoxSelected bernilai true (checkbox diklik)
                if (checkBoxSelected) {
                    // maka, isi dari textfield (input user) disimpan ke variable nama
                    String nama = textField.getText();
                    // lalu, variable nama dimasukan kedalam textarea
                    textArea.append("Hello " + nama + "\n");
                    // setelah itu, textfield (input user) dikosongkan lagi untuk menginput data
                    // berikutnya
                    textField.setText("");
                }
                // jika variabel checkBoxSelected bernilai false
                else {
                    // string "Anda tidak mencentang kotak persetujuan" dimasukan ke textarea
                    textArea.append("Anda tidak mencentang kotak persetujuan\n");
                }
            }
        });

        // baris-baris berikut menambahkan semua elemen yang di atas tadi ke frame
        this.add(labelInput);
        this.add(textField);
        this.add(checkBox);
        this.add(button);
        this.add(textArea);

        // frame diberikan ukuran 400 x 400
        this.setSize(400, 500);
        // frame diatur layoutnya dengan nilai null
        this.setLayout(null);
    }

    // fungsi main
    public static void main(String[] args) {
        // fungsi java swing yang dioverride untuk menjalankan JavaGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // instansiasi java class
                HelloCheckBox h = new HelloCheckBox();
                // objek tersebut ditampilkan ke frame
                h.setVisible(true);
            }
        });
    }
}
