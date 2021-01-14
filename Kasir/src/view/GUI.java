package view;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.*;

public class GUI extends componen{
    
    JFrame LogReg = new JFrame();
    
//    JLabel labelniplogin,labelnama,labelpasswordlogin,labelnotelp,labeltgllahir,labelnipdaftar,labelpassworddaftar,outletlabel,alamatlabel;
//    JButton check;
//    JPasswordField passwordlogin,passworddaftar;
    private boolean ceklogin = false;
    
    public GUI(){
        LogReg.setSize(700,630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.lightGray);
        top = new JLabel("Jayashoesnation");
        top.setBounds(220, 10, 600, 50);
        top.setFont(new Font("Times New Roman",Font.BOLD,40));
        LogReg.add(top);
        login = new JLabel("login");
        login.setBounds(320, 70, 400, 100);
        login.setFont(new Font("Times New Roman",Font.BOLD,30));
        LogReg.add(login);
        
//        radioadmin = new JRadioButton("admin");
        radioadmin.setBounds (250, 150, 100, 30);
        radioadmin.setBackground(Color.CYAN);
        LogReg.add(radioadmin);
        
//        radiokaryawan = new JRadioButton("karyawan");
        radiokaryawan.setBounds(370, 150, 100, 30);
        radiokaryawan.setBackground(Color.CYAN);
        LogReg.add(radiokaryawan);
        
        
        labelniplogin.setBounds (250,180,30,30);
        LogReg.add(labelniplogin);
        textniplogin = new JTextField();
        textniplogin.setBounds (250,210,200,30);
        LogReg.add(textniplogin);
        
        
        labelpasswordlogin.setBounds (250, 246, 100, 30);
        LogReg.add(labelpasswordlogin);
        
        passwordlogin.setBounds (250,275, 200,30);
        LogReg.add(passwordlogin);
        
        check = new JButton("LOGIN");
        check.setBounds (255, 320, 190, 40);
        check.setBackground(Color.WHITE);
        LogReg.add(check);
        

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg. setVisible(true);
        LogReg.setLocationRelativeTo(null);
        radioadmin.addActionListener(new ActionListener()     
        {
        @Override
        public void actionPerformed (ActionEvent ae) {
        if(radioadmin.isSelected()) {
        radiokaryawan.setSelected(false);
        ceklogin = true;
        }
    }
});
        radiokaryawan. addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        if(radiokaryawan.isSelected()) {
        radioadmin.setSelected(false);
        ceklogin = false;
        }
    }
});
        check.addActionListener(new ActionListener()
        {
        @Override
        public void actionPerformed (ActionEvent ae){
        if(ceklogin==true) {
        try{
        allobjctrl.admin.dataAdmin();
        allobjctrl.admin.login(textniplogin.getText(), passwordlogin.getText());
        String nama = allobjctrl.admin.adminEntity().getNama();
        JOptionPane.showMessageDialog(null,"selamat datang "+nama,"information", JOptionPane. INFORMATION_MESSAGE);
        AdminGUI admin = new AdminGUI();
        LogReg.dispose();
        }catch(Exception exception) {
        JOptionPane.showMessageDialog(null,"NIP atau password salah", "information", JOptionPane. INFORMATION_MESSAGE);
              kosong();
        }
        }else{
        try{
        allobjctrl.karyawan. login(textniplogin.getText(), passwordlogin.getText());
        String nama = allobjctrl.karyawan.KaryawanEntity().getNama();
        JOptionPane.showMessageDialog(null,"Selamat Datang "+nama, "information",JOptionPane. INFORMATION_MESSAGE);
        KaryawanGUI kas = new KaryawanGUI();
                LogReg.dispose();
        }catch(Exception exception){
        JOptionPane.showMessageDialog(null,"NIP atau password salah", " information",JOptionPane. INFORMATION_MESSAGE);
               kosong();
            }
        }
    }
        });
        
}
    
}

