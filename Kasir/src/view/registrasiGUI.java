/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import view.*;
import Kasir_Entity.Kasir_IsiEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.JTextArea;

public class registrasiGUI extends componen{
    JFrame Reg = new JFrame();
    JTextArea area = new JTextArea();
    JComboBox poskerja = new JComboBox (Kasir_IsiEntity.posisikerja);
    public registrasiGUI(){
        
        Reg.setSize(1038, 737);
        Reg.setLayout(null);
        Reg.getContentPane().setBackground (Color.LIGHT_GRAY);
        
        daftar.setFont(new Font("Times New Roman", Font.BOLD, 30));
        daftar.setBounds (440, 30, 150, 100);
        Reg.add(daftar);
        
        
        labelnipdaftar.setBounds(400,100,30,30);
        Reg.add(labelnipdaftar);
        textnipdaftar.setBounds (400, 130, 240, 30);
        Reg.add(textnipdaftar);
        
        
        labelnama.setBounds (400, 160, 100, 30);
        Reg.add(labelnama);
        textnama.setBounds(400, 190, 240, 30);
        Reg.add(textnama);
        
        
        labelpassworddaftar.setBounds (400, 220, 100,30);
        Reg.add(labelpassworddaftar);
        passworddaftar.setBounds(400, 250, 240, 30);
        Reg.add(passworddaftar);
        
        
        labelnotelp.setBounds(400, 280, 100, 30);
        Reg.add(labelnotelp);
        textnotelp.setBounds(400, 310, 240, 30);
        Reg.add(textnotelp);
        
       
        labeltgllahir.setBounds (400, 340, 200, 30);
        Reg.add(labeltgllahir);
        texttgllahir.setBounds (400, 370, 240, 30);
        Reg.add(texttgllahir);
        
        
        alamatlabel.setBounds (400, 400, 200, 30);
        Reg.add(alamatlabel);
        textalamat.setBounds (400, 430, 240, 30);
        Reg.add(textalamat);
        
        
        daftarposker.setBounds (400,460,200,30);
        Reg.add(daftarposker);
        poskerja.setBounds (400, 490, 240, 30);
        Reg.add(poskerja);
        
        labeljeniskelamin.setBounds(400, 520, 250, 30);
        laki.setBounds(400, 530, 100, 30);
        laki.setBackground(Color.CYAN);
        Reg.add(laki);
        
        perempuan.setBounds(535, 530, 100, 30);
        perempuan.setBackground(Color.CYAN);
        Reg.add(perempuan);
        
        
        cekreg.setBounds(460, 565, 100, 40);
        cekreg.setBackground(Color.GREEN);
        Reg.add(cekreg);
        
        
        back.setBounds(90, 600, 100, 30);
        back.setBackground(Color.red);
        Reg.add(back);
        
        Reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Reg. setVisible(true);
        Reg.setLocationRelativeTo(null);
        
        cekreg.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                cekreg.setBackground(new Color(0xf1c40f));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                cekreg.setBackground(new Color(0xf39c12));
            }
        });
        cekreg.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed(ActionEvent ae){
        try{
        String nip = textnipdaftar.getText();
        String pass = passworddaftar.getText();
        String nama = textnama.getText();
        String notelp = textnotelp.getText();
        Date tgllahir = new Date(texttgllahir.getText());
        String alamat = textalamat.getText();
        String jeniskelamin = textjeniskelamin.getText().toUpperCase();
        int posker = poskerja.getSelectedIndex();
//        allobjctrl.karyawan.daftarPoskerja(posker, allobjctrl.karyawan.getData(), false);
        allobjctrl.karyawan.insert(nip, pass, nama, notelp, tgllahir, alamat, jeniskelamin, posker);
        JOptionPane.showMessageDialog(null,"Registrasi Sukses", "information", JOptionPane. INFORMATION_MESSAGE);
                kosong();
                allobjctrl.karyawan.daftarPoskerja(posker,allobjctrl.karyawan.getData(),false);
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Registrasi Gagal",JOptionPane. INFORMATION_MESSAGE);
            }
//        cekreg.setText(datakaryawan());
        }
    });
        
        back.addActionListener(new ActionListener(){
@Override
    public void actionPerformed(ActionEvent ae){
        Reg.dispose();
        GUI gui = new GUI();
    }
       
    });
        
        laki.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               if(laki.isSelected()){
                   perempuan.setSelected(false);
                   textjeniskelamin.setText("laki-laki");
               }
            }
        });
        
        perempuan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(perempuan.isSelected()){
                    laki.setSelected(false);;
                    textjeniskelamin.setText("perempuan");
                }
            }
        });
        
    }    
//   public String datakaryawan(){
//        int cek = allobjctrl.karyawan.cekDaftarkas(allobjctrl.karyawan.KaryawanEntity().getNip());
//        String cekverif;
//        if(allobjctrl.karyawan.showDaftarkas(cek).isVerified() == false) {
//            cekverif = "belum diverifikasi";
//        }else{
//            cekverif = "sudah diverifikasi";
//        }
//String text = "Npm = "+allobjctrl.karyawan.showDaftarkas(cek).getKaryawan().getNip()+"\n"+ "Nama = "+allobjctrl.karyawan.showDaftarkas(cek).getKaryawan().getNama()+"\n"
//        + "No Telp = "+allobjctrl.karyawan.showDaftarkas(cek).getKaryawan().getNo_telp()+"\n"+ "Tanggal Lahir = "+new SimpleDateFormat("dd-MM-yyyy").
//        format(allobjctrl.karyawan.showDaftarkas(cek).getKaryawan().getTglLahir())+"\n"+ "verifikasi = " +cekverif+"\n"+ "Kelas = "+allobjctrl.karyawan.
//        showDaftarkas(cek).getKaryawan().getAlamat()+"\n"+ "Posisi Kerja = "+Kasir_IsiEntity.posisikerja[allobjctrl.karyawan.showDaftarkas(cek).getIndexpos()];
//            return text;
//        }
}
