/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 5
package main.pertemuan05;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */
public class Latihan3 extends JFrame {
    // menyiapakan variabel untuk menampung apakah checkbox telah diklik
    private boolean checkBoxSelected;

    public Latihan3() {
        // checkBoxSelected diberi nilai awal false
        this.checkBoxSelected = false;
        // memberikan perintah bahwa ketika tombol window X ditekan, maka JavaGUI akan
        // diclose
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // controlPanel untuk menampung panel dan panel2
        JPanel controlPanel = new JPanel();
        // controlPanel diberi layout FlowLayout
        controlPanel.setLayout(new FlowLayout());

        // panel untuk menyimpan label, input, radio button, checkbox
        JPanel panel = new JPanel();
        // atur ukuran panel 300 x 300
        panel.setSize(300, 300);
        // panel2 untuk menyimpan button
        JPanel panel2 = new JPanel();
        // atur ukuran panel2 100 x 100
        panel2.setSize(100, 100);

        // instansiasi GridBagLayout
        GridBagLayout layout = new GridBagLayout();
        // atur layout panel dengan objek GridBagLayout
        panel.setLayout(layout);
        // instansiasi GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();

        // membuat label untuk judul form
        JLabel headerLabel = new JLabel("Form Biodata", JLabel.CENTER);

        // membuat label untuk input nama
        JLabel labelNama = new JLabel("Nama: ");

        // membuat textfield untuk input nama
        JTextField textFieldNama = new JTextField();

        // membuat label untuk input telepon
        JLabel labelTelepon = new JLabel("Nomor HP: ");

        // membuat textfield untuk input nama
        JTextField textFieldTelepon = new JTextField();

        // membuat label untuk input radio button
        JLabel labelRadio = new JLabel("Jenis Kelamin:");

        // membuat radio button dengan nilai laki-laki dan true
        JRadioButton radioButton1 = new JRadioButton("Laki-Laki", true);

        // membuat radio button dengan nilai perempuan
        JRadioButton radioButton2 = new JRadioButton("Perempuan");

        // instansiasi ButtonGroup dengan nama bg
        ButtonGroup bg = new ButtonGroup();
        // memasukan semua radio button ke bg
        bg.add(radioButton1);
        bg.add(radioButton2);

        // membuat checkbox untuk verifikasi WNA
        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");

        // membuat button untuk simpan data
        JButton button = new JButton("Simpan");

        // membuat textarea untuk output data
        JTextArea textArea = new JTextArea("");
        // mengatur ukuran dan letak textarea
        textArea.setBounds(15, 350, 350, 100);

        // atur ukuran objek GridBagConstraints menjadi memenuhi panjang horizontal
        // panel
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 0;
        // masukan labelNama dan objek GridBagConstraints ke panel, nantinya labelNama
        // akan sesuai dengan gbc.fill, gbc.gridx, dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(labelNama, gbc);

        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 1;
        // masukan textFieldNama dan objek GridBagConstraints ke panel, nantinya
        // textFieldNama
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(textFieldNama, gbc);

        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 2;
        // masukan labelTelepon dan objek GridBagConstraints ke panel, nantinya
        // labelTelepon
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(labelTelepon, gbc);

        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 0;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 3;
        // masukan textFieldTelepon dan objek GridBagConstraints ke panel, nantinya
        // textFieldTelepon
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(textFieldTelepon, gbc);

        // atur ukuran objek GridBagConstraints menjadi memenuhi panjang horizontal
        // panel
        gbc.fill = GridBagConstraints.HORIZONTAL;
        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 1;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 0;
        // masukan labelRadio dan objek GridBagConstraints ke panel, nantinya
        // labelRadio
        // akan sesuai dengan gbc.fill, gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(labelRadio, gbc);

        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 1;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 1;
        // masukan radioButton1 dan objek GridBagConstraints ke panel, nantinya
        // radioButton1
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(radioButton1, gbc);

        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 1;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 2;
        // masukan radioButton2 dan objek GridBagConstraints ke panel, nantinya
        // radioButton2
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(radioButton2, gbc);

        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 1;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 3;
        // masukan checkBox dan objek GridBagConstraints ke panel, nantinya
        // checkBox
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel.add(checkBox, gbc);

        // atur ukuran objek GridBagConstraints menjadi memenuhi panjang horizontal
        // panel
        gbc.fill = GridBagConstraints.VERTICAL;
        // atur letak objek GridBagConstraints ke posisi x = 0
        gbc.gridx = 1;
        // atur letak objek GridBagConstraints ke posisi y = 0
        gbc.gridy = 4;
        // masukan button dan objek GridBagConstraints ke panel, nantinya
        // button
        // akan sesuai dengan gbc.gridx dan gbc.gridy yang tadi telah
        // ditentukan.
        panel2.add(button);

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

        // masukan panel dan panel2 ke controlPanel
        controlPanel.add(panel);
        controlPanel.add(panel2);

        // atur layout frame menjadi GridLayout dengan 4 baris, 1 kolom
        this.setLayout(new GridLayout(4, 1));
        // masukan semua komponen tadi (headerLabel, controlPanel, panel2, textArea) ke
        // frame
        this.add(headerLabel);
        this.add(controlPanel);
        this.add(panel2);
        this.add(textArea);
        // membuat frame dengan ukuran 400 x 500
        this.setSize(500, 500);
    }

    // fungsi main
    public static void main(String[] args) {
        // fungsi java swing yang dioverride untuk menjalankan JavaGUI
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // instansiasi java class
                Latihan3 latihan = new Latihan3();
                // objek tersebut ditampilkan ke frame
                latihan.setVisible(true);
            }
        });
    }
}
