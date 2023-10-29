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
public class HelloRadioButton extends JFrame {

    public HelloRadioButton() {
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

        // membuat label untuk input radio button
        JLabel labelRadio = new JLabel("Jenis Member:");
        // mengatur ukuran dan letak label
        labelRadio.setBounds(15, 100, 350, 10);

        // membuat radio button dengan nilai silver dan true
        JRadioButton radioButton1 = new JRadioButton("Silver", true);
        // mengatur ukuran dan letak radio button
        labelRadio.setBounds(15, 115, 350, 30);

        // membuat radio button dengan nilai gold
        JRadioButton radioButton2 = new JRadioButton("Gold");
        // mengatur ukuran dan letak radio button
        labelRadio.setBounds(15, 145, 350, 30);

        // membuat radio button dengan nilai platinum
        JRadioButton radioButton3 = new JRadioButton("Platinum");
        // mengatur ukuran dan letak radio button
        labelRadio.setBounds(15, 175, 350, 30);

        // instansiasi ButtonGroup dengan nama bg
        ButtonGroup bg = new ButtonGroup();
        // memasukan semua radio button ke bg
        bg.add(radioButton1);
        bg.add(radioButton2);
        bg.add(radioButton3);

        // membuat button untuk simpan data
        JButton button = new JButton("Simpan");
        // mengatur ukuran dan letak button
        button.setBounds(15, 205, 100, 40);

        // membuat textarea untuk output data
        JTextArea textArea = new JTextArea("");
        // mengatur ukuran dan letak textarea
        textArea.setBounds(15, 250, 350, 100);

        // memberikan action listener kepada button simpan
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // membuat variabel jenisMember untuk menampung nilai dari radio button yang di
                // klik
                String jenisMember = "";

                // jika Silver diklik,
                if (radioButton1.isSelected()) {
                    // maka jenisMember akan bernilai Silver
                    jenisMember = radioButton1.getText();
                }
                // jika Gold diklik,
                if (radioButton2.isSelected()) {
                    // maka jenisMember akan bernilai Gold
                    jenisMember = radioButton2.getText();
                }
                // jika Platinum diklik,
                if (radioButton3.isSelected()) {
                    // maka jenisMember akan bernilai Platinum
                    jenisMember = radioButton3.getText();
                }

                // isi dari textfield (input user) disimpan ke variable nama
                String nama = textField.getText();
                // lalu, variable nama dimasukan kedalam textarea
                textArea.append("Hello " + nama + "\n");
                // begitu juga dengan variable jenisMember dimasukan kedalam textarea
                textArea.append("Anda adalah member " + jenisMember + "\n");
                // setelah itu, textfield (input user) dikosongkan lagi untuk menginput data
                // berikutnya
                textField.setText("");
            }
        });

        // baris-baris berikut menambahkan semua elemen yang di atas tadi ke frame
        this.add(labelInput);
        this.add(textField);
        this.add(labelRadio);
        this.add(radioButton1);
        this.add(radioButton2);
        this.add(radioButton3);
        this.add(button);
        this.add(textArea);

        // frame diberikan ukuran 400 x 500
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
                HelloRadioButton h = new HelloRadioButton();
                // objek tersebut ditampilkan ke frame
                h.setVisible(true);
            }
        });
    }
}
