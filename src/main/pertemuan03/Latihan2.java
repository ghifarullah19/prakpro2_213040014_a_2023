/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 3
package main.pertemuan03;

import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class Latihan2 extends JFrame {
    // menyiapakan variabel untuk menampung apakah checkbox telah diklik
    private boolean checkBoxSelected;

    public Latihan2() {
        // checkBoxSelected diberi nilai awal false
        this.checkBoxSelected = false;
        // memberikan perintah bahwa ketika tombol window X ditekan, maka JavaGUI akan
        // diclose
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

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

        // membuat button untuk simpan data
        JButton button = new JButton("Simpan");
        // mengatur ukuran dan letak button
        button.setBounds(15, 300, 100, 40);

        // membuat textarea untuk output data
        JTextArea textArea = new JTextArea("");
        // mengatur ukuran dan letak textarea
        textArea.setBounds(15, 350, 350, 100);

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
                // membuat variabel jenisKelamin untuk menampung nilai dari radio button yang di
                // klik
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

                // isi dari textfield (input user) disimpan ke variable nama
                String nama = textFieldNama.getText();
                // variable nama dimasukan kedalam textarea
                textArea.append("Nama\t: " + nama + "\n");
                // isi dari textfield (input user) disimpan ke variable nama
                String telepon = textFieldTelepon.getText();
                // variable telepon dimasukan kedalam textarea
                textArea.append("Nomor HP\t: " + telepon + "\n");
                // variable jenisKelamin dimasukan kedalam textarea
                textArea.append("Jenis Kelamin\t: " + jenisKelamin + "\n");

                // jika checkBoxSelected bernilai true,
                if (checkBoxSelected) {
                    // string WNA: Ya dimasukan ke textarea
                    textArea.append("WNA\t: " + "Ya\n");
                }
                // jika checkBoxSelected bernilai false,
                else {
                    // string WNA: Bukan dimasukan ke textarea
                    textArea.append("WNA\t: " + "Bukan\n");
                }
                // garis pembatas
                textArea.append("==================================\n");
                // kembalikan textfield nama dan telepon ke kondisi awal
                textFieldNama.setText("");
                textFieldTelepon.setText("");
                // kembalikan checkbox ke kondisi awal
                checkBox.setSelected(false);
            }
        });

        // memasukan semua elemen ke frame
        this.add(labelNama);
        this.add(textFieldNama);
        this.add(labelTelepon);
        this.add(textFieldTelepon);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(checkBox);
        this.add(button);
        this.add(textArea);

        // membuat frame dengan ukuran 400 x 500
        this.setSize(400, 500);
        // layout frame diberikan nilai null
        this.setLayout(null);
    }

    // fungsi main
    public static void main(String[] args) {
        // fungsi java swing yang dioverride untuk menjalankan JavaGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // instansiasi java class
                Latihan2 latihan = new Latihan2();
                // objek tersebut ditampilkan ke frame
                latihan.setVisible(true);
            }
        });
    }
}
