/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// pertemuan 4
package main.pertemuan04;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author ghifarullah19
 */

public class HelloGridLayout extends JFrame implements ActionListener {
    // membuat button-button untuk di frame
    private JButton buttonA;
    private JButton buttonB;
    private JButton buttonC;
    private JButton buttonD;
    private JButton buttonE;
    private JButton buttonF;
    private JButton buttonG;
    private JButton buttonH;
    private JButton buttonI;

    // membuat array button untuk menyimpan button-button yang telah diklik
    private JButton[] buttons;
    // variabel sebagai flag apakah permainan diselesaikan atau tidak
    private boolean gameOver;

    public HelloGridLayout() {
        // memberikan perintah ketika tombol X pada frame di klik, maka GUI akan diclose
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // inisialisasi nilai false ke variabel gameOver
        gameOver = false;

        // inisialisasi button dengan string kosong
        buttonA = new JButton("");
        buttonB = new JButton("");
        buttonC = new JButton("");
        buttonD = new JButton("");
        buttonE = new JButton("");
        buttonF = new JButton("");
        buttonG = new JButton("");
        buttonH = new JButton("");
        buttonI = new JButton("");

        // inisialisasi ukuran array sebesar 9
        buttons = new JButton[9];

        // memasukan button-button tadi ke dalam array sesuai dengan indeks
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;

        // memberikan action listener ke semua button
        buttonA.addActionListener(this);
        buttonB.addActionListener(this);
        buttonC.addActionListener(this);
        buttonD.addActionListener(this);
        buttonE.addActionListener(this);
        buttonF.addActionListener(this);
        buttonG.addActionListener(this);
        buttonH.addActionListener(this);
        buttonI.addActionListener(this);

        // mengatur layout frame dengan GridLayout 3 baris, 3 kolom
        this.setLayout(new GridLayout(3, 3));

        // memasukan semua button ke dalam frame
        this.add(buttonA);
        this.add(buttonB);
        this.add(buttonC);
        this.add(buttonD);
        this.add(buttonE);
        this.add(buttonF);
        this.add(buttonG);
        this.add(buttonH);
        this.add(buttonI);

        // mengatur ukuran frame menjadi 300 x 300
        this.setSize(300, 300);
    }

    // modifikasi action listener dengan method actionPerformed
    public void actionPerformed(ActionEvent e) {
        // jika permainan tidak berhenti,
        if (!gameOver) {
            // convert event e menjadi button
            JButton button = (JButton) e.getSource();

            // jika user menekan button yang diklik itu string kosong,
            if (button.getText().isEmpty()) {
                // maka button itu diatur text nya menjadi 0
                button.setText("0");
                // jalanlan method checkWinner()
                checkWinner();

                // selama permainannya belum berhenti,
                if (!gameOver) {
                    // maka secara otomatis, akan iterasi seluruh elemen array buttons
                    for (int i = 0; i < buttons.length; i++) {
                        // jika ditemukan button yang string kosong,
                        if (buttons[i].getText().isEmpty()) {
                            // button itu akan diberikan string X
                            buttons[i].setText("X");
                            // iterasi dipaksa berhenti
                            break;
                        }
                    }
                    // setelah itu, checkWinner() method dijalankan lagi
                    checkWinner();
                }
            }
        }
    }

    // method checkWinner() untuk menentukan pemenang
    private void checkWinner() {
        // variabel string winner disiapkan dengan nilai awal string kosong
        String winner = "";

        // jika buttonA memiliki nilai dan buttonB serta buttonC juga memiliki nilai,
        if (!buttonA.getText().isEmpty()
                && buttonA.getText().equals(buttonB.getText())
                && buttonA.getText().equals(buttonC.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonA
            winner = buttonA.getText();

            // buttonA, buttonB, dan buttonC diatur warnanya menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonB.setForeground(Color.RED);
            buttonC.setForeground(Color.RED);
        }
        // jika buttonD memiliki nilai dan buttonE serta buttonF juga memiliki nilai,
        else if (!buttonD.getText().isEmpty()
                && buttonD.getText().equals(buttonE.getText())
                && buttonD.getText().equals(buttonF.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonD
            winner = buttonD.getText();

            // buttonD, buttonE, dan buttonF diatur warnanya menjadi warna merah
            buttonD.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
        }
        // jika buttonG memiliki nilai dan buttonH serta buttonI juga memiliki nilai,
        else if (!buttonG.getText().isEmpty()
                && buttonG.getText().equals(buttonH.getText())
                && buttonG.getText().equals(buttonI.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonG
            winner = buttonG.getText();

            // buttonG, buttonH, dan buttonI diatur warnanya menjadi warna merah
            buttonG.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        // jika buttonA memiliki nilai dan buttonD serta buttonG juga memiliki nilai,
        else if (!buttonA.getText().isEmpty()
                && buttonA.getText().equals(buttonD.getText())
                && buttonA.getText().equals(buttonG.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonA
            winner = buttonA.getText();

            // buttonA, buttonD, dan buttonG diatur warnanya menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonD.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }
        // jika buttonB memiliki nilai dan buttonE serta buttonH juga memiliki nilai,
        else if (!buttonB.getText().isEmpty()
                && buttonB.getText().equals(buttonE.getText())
                && buttonB.getText().equals(buttonH.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonB
            winner = buttonB.getText();

            // buttonB, buttonE, dan buttonH diatur warnanya menjadi warna merah
            buttonB.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonH.setForeground(Color.RED);
        }
        // jika buttonC memiliki nilai dan buttonF serta buttonI juga memiliki nilai,
        else if (!buttonC.getText().isEmpty()
                && buttonC.getText().equals(buttonF.getText())
                && buttonC.getText().equals(buttonI.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonC
            winner = buttonC.getText();

            // buttonC, buttonF, dan buttonI diatur warnanya menjadi warna merah
            buttonC.setForeground(Color.RED);
            buttonF.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        // jika buttonA memiliki nilai dan buttonE serta buttonI juga memiliki nilai,
        else if (!buttonA.getText().isEmpty()
                && buttonA.getText().equals(buttonE.getText())
                && buttonA.getText().equals(buttonI.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonA
            winner = buttonA.getText();

            // buttonA, buttonE, dan buttonI diatur warnanya menjadi warna merah
            buttonA.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonI.setForeground(Color.RED);
        }
        // jika buttonC memiliki nilai dan buttonE serta buttonG juga memiliki nilai,
        else if (!buttonC.getText().isEmpty()
                && buttonC.getText().equals(buttonE.getText())
                && buttonC.getText().equals(buttonG.getText())) {
            // maka variabel winner diberikan nilai text yang dimiliki buttonC
            winner = buttonC.getText();

            // buttonC, buttonE, dan buttonG diatur warnanya menjadi warna merah
            buttonC.setForeground(Color.RED);
            buttonE.setForeground(Color.RED);
            buttonG.setForeground(Color.RED);
        }

        // nilai gameOver berdasarkan variabel winner apakah berisi nilai atau tidak
        gameOver = !winner.isEmpty();
    }

    // fungsi main
    public static void main(String[] args) {
        // fungsi java swing yang dioverride untuk menjalankan JavaGUI
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // instansiasi java class
                HelloGridLayout h = new HelloGridLayout();
                // objek tersebut ditampilkan ke frame
                h.setVisible(true);
            }
        });
    }
}
