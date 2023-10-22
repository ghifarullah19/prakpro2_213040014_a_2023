/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
// Pertemuan 6
// Berada di package main
package main;

// Import semua class dari javax.swing.table
import javax.swing.table.*;
// Import class ArrayList dari java.util
import java.util.ArrayList;
// Import class List dari java.util
import java.util.List;

/**
 *
 * @author ghifarullah19
 */

// Membuat class MyTableModel yang mewarisi class AbstractTableModel untuk membuat model tabel
public class MyTableModel extends AbstractTableModel {
    // Array columnNames untuk menyimpan nama-nama kolom
    private String[] columnNames = {"Nama", "Jenis Member"};
    // Membuat ArrayList dengan nama data yang berisi ArrayList dengan tipe String untuk menyimpan data dari input
    private ArrayList<ArrayList<String>> data = new ArrayList<ArrayList<String>>();
    
    // Fungsi untuk menambah jumlah kolom
    public int getColumnCount() {
        // Kembalikan panjang/ukuran dari array columnNames
        return columnNames.length;
    }
    
    // Fungsi untuk menambah jumlah baris
    public int getRowCount() {
        // Kembalikan jumlah data yang diterima/panjang dari ArrayList data
        return data.size();
    }
    
    // Fungsi untuk mendapatkan nama dari kolom yang dipilih dari parameter
    public String getColumnName(int col) {
        // Kembalikan elemen columnNames dengan index col
        return columnNames[col];
    }
    
    // Fungsi untuk mendapatkan nilai dari baris dan kolom tertentu
    public Object getValueAt(int row, int col) {
        // Menyimpan elemen dari ArrayList data dari baris yang dipilih ke List rowItem
        List<String> rowItem = data.get(row);
        // Kembalikan elemen rowItem dari index col
        return rowItem.get(col);
    }
    
    // Fungsi untuk mengatur apakah cell bisa diedit atau tidak
    public boolean isCellEditable(int row, int col) {
        // Kembalikan nilai false
        return false;
    }
    
    // Method untuk menambah nilai ke table
    public void add(ArrayList<String> value) {
        // Menambahkan input user ke ArrayList data
        data.add(value);
        // Menambahkan elemen-elemen ArrayList data ke table
        fireTableRowsInserted(data.size() - 1, data.size() - 1);
    }
}
