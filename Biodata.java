/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Soal_2;

import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class Biodata {
    public static void main(String[] args){
        String nama = JOptionPane.showInputDialog("Masukkan nama anda");
        JOptionPane.showMessageDialog(null, "Halo " + nama);
        
        String alamat = JOptionPane.showInputDialog(null, "Masukkan alamat anda");
        JOptionPane.showMessageDialog(null, "Anda tinggal di " + alamat);
        
        String npm = JOptionPane.showInputDialog(null, "Masukkan NPM anda");
        
        
        String tahunAngkatan = JOptionPane.showInputDialog("Masukkan Tahun angkatan anda");
        JOptionPane.showMessageDialog(null, "Tahun angkatan " + tahunAngkatan);
        
        String jurusan = JOptionPane.showInputDialog("Masukkan Jurusan Anda");
        JoptionPane.showMessageDialog(null, "Anda berada di jurusan " + jurusan);
    }
}
