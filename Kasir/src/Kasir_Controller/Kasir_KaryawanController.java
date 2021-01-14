/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Controller;

import Kasir_Entity.DaftarkasEntity;
import Kasir_Entity.Kasir_KaryawanEntity;
import Kasir_Entity.Kasir_IsiEntity;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

public class Kasir_KaryawanController implements Kasir_ControllerInterface {
    int indexLogin = 0;
    public Kasir_KaryawanController(){
        }
    public Kasir_KaryawanEntity getData(){
        return Kasir_AllObjectModel.karyawanModel.getKaryawanArrayList(indexLogin);
    }
    public void daftarPoskerja(int indexposkerja, Kasir_KaryawanEntity karyawanEntity,boolean isVerified){
        Kasir_AllObjectModel.daftarkasModel.insertDataDaftarkas(new DaftarkasEntity(karyawanEntity, isVerified, indexposkerja));
    }
    public void HapusKaryawan(int cek){
        Kasir_AllObjectModel.karyawanModel.HapusData(cek);
    }
    public void HapusKaryawanDaftar(int cek){
        Kasir_AllObjectModel.daftarkasModel.HapusDataDaftar(cek);
    }
    
    @Override
    public void login(String nip,String password){
        indexLogin = Kasir_AllObjectModel.karyawanModel.cekData(nip,password);
    }
    public void insert(String nip,String password,String nama,String no_telp,Date tglLahir,String alamat,String jeniskelamin, int poskerja){
        Kasir_AllObjectModel.karyawanModel.insert(new Kasir_KaryawanEntity(nip, password, nama, no_telp, tglLahir, alamat,jeniskelamin, poskerja));
    }
    public Kasir_KaryawanEntity KaryawanEntity(){
        return Kasir_AllObjectModel.karyawanModel.getKaryawanArrayList(indexLogin);
    }
//    public int CekData(String nip){
//        int cek = Kasir_AllObjectModel.karyawanModel.cekData(nip, nip);
//        return cek;
//    }
    public int cekDaftarkas(String nip, String password){
        int cek = Kasir_AllObjectModel.daftarkasModel.cekData(nip, password);
        return cek;
    }
    public DaftarkasEntity showDaftarkas(int index){
        return Kasir_AllObjectModel.daftarkasModel.showDaftarkas(index);
    }
    public DefaultTableModel daftarkas(){
        DefaultTableModel dtmdaftarkas = new DefaultTableModel();
        Object[] kolom ={"NIP","Nama","Password","No Telp","Tgl Lahir","Posisi Kerja","Verified","Alamat","Jenis Kelamin"};
        dtmdaftarkas.setColumnIdentifiers(kolom);
        int size = Kasir_AllObjectModel.daftarkasModel.alldatakas().size();
        String verif = null;
        for (int i=0;i<size;i++){
            if(Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).isVerified()==false){
        verif = "no";
    }else{
        verif = "yes";
            }
    Object [] data = new Object[9];
    data[0] = Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getNip();
    data[1] = Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getNama();
    data[2] = Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getPassword();
    data[3] = Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getNo_telp();
    data[4] = new SimpleDateFormat("dd-MM-yyyy").format(Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getTglLahir());
    data[5] = Kasir_IsiEntity.posisikerja[Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getIndexPos()];
    data[6] = verif;
    data[7] = Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getAlamat();
    data[8] = Kasir_AllObjectModel.daftarkasModel.alldatakas().get(i).getKaryawan().getJeniskelamin();
    dtmdaftarkas.addRow(data);
        }
    return dtmdaftarkas;
    }

  }
