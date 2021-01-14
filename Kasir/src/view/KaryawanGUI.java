package view;

import Kasir_Controller.Kasir_AllObjectModel;
import Kasir_Entity.Kasir_IsiEntity;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javafx.scene.control.ComboBox;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KaryawanGUI extends componen {

    JFrame Karyawan = new JFrame();
//        JButton back, daftarbtn;
//        JTextArea area = new JTextArea();
//        JLabel datadiri, daftarposker;
    JComboBox piltreat = new JComboBox(Kasir_IsiEntity.treament);
    int u, t = 0, k, total;
    String text1,text2,text3 = null,text4,text5;

    public KaryawanGUI() {
        Karyawan.setSize(1100, 840);
        Karyawan.setLayout(null);
        Karyawan.getContentPane().setBackground(Color.LIGHT_GRAY);

        labeltransaksi.setFont(new Font("Times New Roman", Font.BOLD, 30));
        labeltransaksi.setBounds(450, 30, 200, 30);
        Karyawan.add(labeltransaksi);

        labelkode.setBounds(30, 80, 100, 30);
        Karyawan.add(labelkode);
        textkode.setBounds(30, 110, 240, 30);
        Karyawan.add(textkode);

        labelnama.setBounds(30, 140, 100, 30);
        Karyawan.add(labelnama);
        textnama.setBounds(30, 170, 240, 30);
        Karyawan.add(textnama);

        labelnotelp.setBounds(30, 200, 100, 30);
        Karyawan.add(labelnotelp);
        textnotelp.setBounds(30, 230, 240, 30);
        Karyawan.add(textnotelp);

        alamatlabel.setBounds(30, 260, 200, 30);
        Karyawan.add(alamatlabel);
        textalamat.setBounds(30, 290, 240, 30);
        Karyawan.add(textalamat);

        labeltreatment.setBounds(30, 320, 200, 30);
        Karyawan.add(labeltreatment);
        piltreat.setBounds(30, 350, 240, 30);
        Karyawan.add(piltreat);

        labelharga.setBounds(30, 380, 200, 30);
        Karyawan.add(labelharga);
        textharga.setBounds(30, 410, 240, 30);
        Karyawan.add(textharga);

        labelbanyak.setBounds(30, 440, 200, 30);
        Karyawan.add(labelbanyak);
        textbanyak.setBounds(30, 470, 240, 30);
        Karyawan.add(textbanyak);
        
        labeluang.setBounds(620, 390, 200, 30);
        Karyawan.add(labeluang);
        textuang.setBounds(620, 420, 180, 30);
        Karyawan.add(textuang);
        
        bayar.setBounds(695, 460, 100, 30);
        Karyawan.add(bayar);

        checkout.setBounds(30, 510, 100, 30);
        checkout.setBackground(Color.white);
        Karyawan.add(checkout);

//        labeltotal.setBounds(30, 500, 200, 30);
//        Karyawan.add(labeltotal);
//        texttotal.setBounds(30, 530, 240, 30);
//        Karyawan.add(texttotal);
        area.setBounds(400, 90, 400, 300);
        Karyawan.add(area);

//        daftarposker = new JLabel("Daftar Posisi Kerja");
//        daftarposker.setBounds (450,30,250,30);
//        daftarposker.setFont(new Font("Times New Roman",Font.BOLD, 30));
//        Karyawan.add(daftarposker);
//        pilkas.setBounds (450, 90, 230, 30);
//        Karyawan.add(pilkas);
//        daftarbtn = new JButton("Daftar");
//        daftarbtn.setBounds (500, 200, 100, 30);
//        daftarbtn.setBackground(Color.GREEN);
//        Karyawan.add(daftarbtn);
        back.setBounds(30, 720, 100, 30);
        back.setBackground(Color.red);
        Karyawan.add(back);
        Karyawan.setVisible(true);
        Karyawan.setLocationRelativeTo(null);
        Karyawan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        if(cek==-1){
//        JOptionPane.showMessageDialog(null, "Anda Belum Daftar Praktikum","information",JOptionPane. INFORMATION_MESSAGE);
//        }else if(cek==-2){
//        JOptionPane.showMessageDialog(null, "Anda Belun Daftar praktikum", "information",JOptionPane. INFORMATION_MESSAGE);
//        }else{
//        area.setText(datakaryawan());
//        }
//        daftarbtn.addActionListener(new ActionListener(){
//@Override
//    public void actionPerformed(ActionEvent ae){
//        int indexpos = pilkas.getSelectedIndex();
//        allobjctrl.karyawan.daftarPoskerja(indexpos,allobjctrl.karyawan.getData(),false);
//                area.setText(datakaryawan());
//        }
//    });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Karyawan.dispose();
                GUI men = new GUI();
            }
        });

        piltreat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
//            JOptionPane.showMessageDialog(null,piltreat.getSelectedIndex(),"information",JOptionPane. INFORMATION_MESSAGE);
                textharga.setText(String.valueOf(Kasir_IsiEntity.harga[piltreat.getSelectedIndex()]));
            }
        });
//        Kasir_IsiEntity.harga[Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getIndexPos];
//        piltreat.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                if(piltreat.getSelectedIndex() == 0){
//                    Kasir_IsiEntity.harga[0];
//                }
//                int treat = piltreat.getSelectedIndex();
//                
//            }
//       });
        checkout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText(pembayaran());
            }
        });
        
        bayar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                area.setText(lanjut());
           }
        });
    }

    public String pembayaran() {
        text1 ="PEMBAYARAN!!"+"\n"+"--------------------"+"\n"+"Nama Customer = " + textnama.getText()+"\n"+"no telp = " + textnotelp.getText()+"\n"+"Alamat = " 
                + textalamat.getText()+"\n"+"Treatment yang anda pilih = ";

        for (int j = 0; j <=2; j++) {
            Kasir_IsiEntity.total[j] = Integer.parseInt(textbanyak.getText()) * Integer.parseInt(textharga.getText());
            if (Kasir_IsiEntity.total[j] == 0) {
                text2 = "";
            } else {
                text3 = text1.concat("\n"+"> " + Kasir_IsiEntity.treament[piltreat.getSelectedIndex()] + " X " + textbanyak.getText() + " = Rp. " + Kasir_IsiEntity.total[j]) ;
            }
        }
        for (int j = 0; j <= 2; j++) {
            total = Kasir_IsiEntity.total[j];
            t = Kasir_IsiEntity.total[j];
        }
        text4 = text3.concat("\n"+"Total Harga = Rp. " +t);
//        System.out.print("Uang anda = ");
//    u = input.nextInt();
//    k=u-t;
//    System.out.println("------------------");
//    System.out.println("Kembalian anda = "+k);
       return text4;
    }
    
    public String lanjut(){
        k = Integer.parseInt(textuang.getText()) - t;
                text5 = text4.concat("\n"+"Uang Anda : Rp. "+textuang.getText()+"\n"+"------------------------------------"+"\n"
                        +"Kembalian Anda : Rp. "+k);  
                return text5;
    }
    
}
