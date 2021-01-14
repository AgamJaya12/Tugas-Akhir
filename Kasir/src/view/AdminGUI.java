package view;
import Kasir_Controller.Kasir_AllObjectModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Kasir_Controller.Kasir_KaryawanController;
import Kasir_Entity.Kasir_IsiEntity;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

public class AdminGUI extends componen {
        JFrame Admin = new JFrame();
  
    public AdminGUI(){
        Admin.setSize(1100, 840);
        Admin.setLayout(null);
        Admin.getContentPane().setBackground (Color.LIGHT_GRAY);
       
        admin.setBounds (450, 30, 200, 30);
        admin.setFont(new Font("Times New Roman", Font.BOLD, 40));
        Admin.add(admin);
        scrolladmin.setBounds (30, 100, 970, 200);
        tabelkaryawan.setModel(allobjctrl.karyawan.daftarkas());
        Admin.add(scrolladmin);
        
        datakaryawan.setBounds(30, 65, 300, 30);
        datakaryawan.setFont(new Font ("Times New Romah", Font.BOLD,25));
        Admin.add(datakaryawan);
        
        
        niplabel.setBounds (50, 320, 100, 30);
        Admin.add(niplabel);
        niptext.setBounds (50, 350, 100, 30);
        Admin.add(niptext);
        
        
        passlabel.setBounds (200, 320, 200, 30);
        Admin.add(passlabel);
        passtext.setBounds (200, 350, 100, 30);
        Admin.add(passtext);
        
        
        daftarakun.setBounds(960, 720, 100, 30);
        daftarakun.setBackground(Color.WHITE);
        Admin.add(daftarakun);
        
        
        verif.setBounds(330, 350, 100, 30);
        verif.setBackground(Color.YELLOW);
        Admin.add(verif);
        
        hapus.setBounds(900, 310, 100, 30);
        hapus.setBackground(Color.red);
        Admin.add(hapus);
        
        
        back.setBounds(50, 720, 100, 30);
        back.setBackground(Color.red);
        Admin.add(back);
        Admin.setLocationRelativeTo(null);
        Admin.setVisible(true);
        Admin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        back.addActionListener(new ActionListener(){
@Override
    public void actionPerformed(ActionEvent ae){
        Admin.dispose();
        GUI men = new GUI();
    }
        });
        verif.addActionListener(new ActionListener(){           
@Override
    public void actionPerformed (ActionEvent ae) {
        String nip = niptext.getText();
        String pass = passtext.getText();
        int index = Kasir_AllObjectModel.daftarkasModel.cekData(nip, pass);
        allobjctrl.admin.updateIsVerified(index,allobjctrl.karyawan.showDaftarkas(index).getIndexPos(),allobjctrl.karyawan.showDaftarkas(index).getKaryawan());
        tabelkaryawan.setModel(allobjctrl.karyawan.daftarkas());
    }
        });
        tabelkaryawan.addMouseListener(new MouseAdapter(){
@Override
    public void mouseClicked(MouseEvent e) {
        int i = tabelkaryawan.getSelectedRow();
        niptext.setText(allobjctrl.karyawan.daftarkas().getValueAt(i, 0).toString());
        passtext.setText(allobjctrl.karyawan.daftarkas().getValueAt(i, 2).toString());
        texthapus.setText(allobjctrl.karyawan.daftarkas().getValueAt(i, 0).toString());
            }
        });
        
        daftarakun.addActionListener(new ActionListener(){ 
            public void actionPerformed(ActionEvent ae){
            Admin.dispose();
            registrasiGUI GUI = new registrasiGUI();
          }
        });
        
        
        hapus.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                hapus.setBackground(new Color(0xe67e22));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                hapus.setBackground(new Color(0xd35400));
            }
        });
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nip = texthapus.getText();
                int cek = allobjctrl.karyawan.cekDaftarkas(nip,null);
                allobjctrl.karyawan.HapusKaryawan(cek);
                allobjctrl.karyawan.HapusKaryawanDaftar(cek);
                tabelkaryawan.setModel(allobjctrl.karyawan.daftarkas());
            }
        });
      }
    }
    

