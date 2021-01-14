/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import Kasir_Entity.Kasir_IsiEntity;

public class componen extends JFrame{
    
         JTable tabelkaryawan = new JTable();
         JScrollPane scrolladmin = new JScrollPane(tabelkaryawan);
    
    
         protected JLabel top = new JLabel("Jayashoesnation");
         protected JButton cekreg = new JButton("Daftar");
         protected JButton back = new JButton("back");
         protected JButton check = new JButton("check");
         protected JButton hapus = new JButton("HAPUS");
         protected JButton verif = new JButton("verif");
         protected JButton daftarakun = new JButton("Daftar");
         protected JButton checkout = new JButton("Cekout");
         protected JButton bayar = new JButton("BAYAR");
    
         protected JRadioButton radioadmin = new JRadioButton("admin");
         protected JRadioButton radiokaryawan = new JRadioButton("karyawan");
         protected JRadioButton laki = new JRadioButton("LAKI - LAKI");
         protected JRadioButton perempuan = new JRadioButton("PEREMPUAN");
    
         protected JLabel admin = new JLabel("Admin");
         protected JLabel niplabel = new JLabel("NIP");
         protected JLabel passlabel = new JLabel("password");
         protected JLabel daftar = new JLabel("Buat Akun");
         protected JLabel login = new JLabel("login");
         protected JLabel labelnipdaftar = new JLabel("NIP");
         protected JLabel labelniplogin = new JLabel("Nip");
         protected JLabel labelnama = new JLabel("Nama");
         protected JLabel labelpassworddaftar = new JLabel("Password");
         protected JLabel labelpasswordlogin = new JLabel("Password");
         protected JLabel labelnotelp = new JLabel("No Telepon");
         protected JLabel labeltgllahir = new JLabel("tanggal Lahir (mm/dd/yyyy)");
         protected JLabel alamatlabel = new JLabel("Alamat");
//         protected JLabel daftarpoker = new JLabel("Daftar Posisi Kerja");
         protected JLabel daftarposker = new JLabel("Daftar Posisi Kerja");
         protected JLabel labeljeniskelamin = new JLabel("JENIS KELAMIN");
         protected JLabel datakaryawan = new JLabel("Data Karyawan :");
         protected JLabel labeltransaksi = new JLabel("TRANSAKSI");
         protected JLabel labelkode = new JLabel("Kode Transaksi");
         protected JLabel labeltreatment = new JLabel("Treatment");
         protected JLabel labelharga = new JLabel("Harga");
         protected JLabel labelbanyak = new JLabel("Banyak");
         protected JLabel labeltotal = new JLabel("Total");
         protected JLabel labeluang = new JLabel("Uang Anda");
         
        
         protected JTextField textnipdaftar = new JTextField();
         protected JTextField textniplogin = new JTextField();
         protected JTextField textnama = new JTextField();
         protected JTextField textnotelp = new JTextField();
         protected JTextField texttgllahir = new JTextField();
         protected JTextField textalamat = new JTextField();
         protected JTextField niptext = new JTextField();
         protected JTextField passtext = new JTextField();
         protected JTextField texthapus = new JTextField();
         protected JTextField textjeniskelamin = new JTextField();
         protected JTextField textkode = new JTextField();
         protected JTextField textharga = new JTextField();
         protected JTextField textbanyak = new JTextField();
         protected JTextField texttotal = new JTextField();
         protected JTextField textuang = new JTextField();
         
         JTextArea area = new JTextArea();
         
         protected JPasswordField passworddaftar = new JPasswordField();
         protected JPasswordField passwordlogin = new JPasswordField();
      
    
   public void kosong(){
        textnipdaftar.setText(null);
        passworddaftar.setText(null);
        textnama.setText(null);
        textnotelp.setText (null);
        texttgllahir.setText(null);
        textniplogin.setText(null);
        passwordlogin.setText(null);
        textalamat.setText(null);
}
    
}
