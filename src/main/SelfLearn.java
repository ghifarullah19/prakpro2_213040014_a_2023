package main;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class SelfLearn extends JFrame {
    SelfLearn() {
        java.util.List<String[]> userPass = new java.util.ArrayList<String[]>();
        userPass.add(new String[] { "ghifarullah19", "lutfi.kupi11" });

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelJudul = new JLabel("LOGIN");
        labelJudul.setBounds(180, 10, 100, 20);

        JLabel labelUsername = new JLabel("Username:");
        labelUsername.setBounds(100, 40, 70, 20);

        JTextField textFieldUsername = new JTextField();
        textFieldUsername.setBounds(210, 40, 100, 30);

        JLabel labelPassword = new JLabel("Password:");
        labelPassword.setBounds(100, 80, 70, 20);

        JTextField textFieldPassword = new JTextField();
        textFieldPassword.setBounds(210, 80, 100, 30);

        JButton buttonKirim = new JButton("Kirim");
        buttonKirim.setBounds(210, 120, 100, 40);

        JButton buttonDaftar = new JButton("Daftar");
        buttonDaftar.setBounds(100, 120, 100, 40);

        JLabel labelInfo = new JLabel("");
        labelInfo.setBounds(130, 200, 150, 100);
        labelInfo.setBorder(BorderFactory.createLineBorder(Color.GREEN, 1, true));
        labelInfo.setHorizontalAlignment(JLabel.CENTER);
        labelInfo.setVerticalAlignment(JLabel.CENTER);
        labelInfo.setVisible(false);

        JPanel panel = new JPanel();
        panel.setBounds(130, 200, 200, 200);
        panel.setBackground(Color.RED);
        panel.setVisible(true);

        buttonKirim.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = textFieldPassword.getText();

                for (int i = 0; i < userPass.size(); i++) {
                    if (userPass.get(i)[0].equals(username) && userPass.get(i)[1].equals(password)) {
                        labelInfo.setText("LOGIN BERHASIL");
                        labelInfo.setVisible(true);
                    }
                }
            }
        });

        buttonDaftar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText();
                String password = textFieldPassword.getText();

                userPass.add(new String[] { username, password });

                labelInfo.setText("DAFTAR BERHASIL");
                labelInfo.setVisible(true);
            }
        });

        this.add(panel);
        this.add(labelJudul);
        this.add(labelUsername);
        this.add(textFieldUsername);
        this.add(labelPassword);
        this.add(textFieldPassword);
        this.add(buttonKirim);
        this.add(buttonDaftar);
        this.add(labelInfo);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SelfLearn latihan = new SelfLearn();
                latihan.setVisible(true);
            }
        });
    }
}
