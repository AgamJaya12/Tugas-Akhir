/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Model;

import Kasir_Entity.DaftarkasEntity;
import Kasir_Entity.Kasir_IsiEntity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class DaftarkasModel implements ModelInterface {

    private ArrayList<DaftarkasEntity> daftarkasArrayList;

    public DaftarkasModel() {
        daftarkasArrayList = new ArrayList<DaftarkasEntity>();
    }

    public void insertDataDaftarkas(DaftarkasEntity daftarkas) {
        daftarkasArrayList.add(daftarkas);
    }

    public ArrayList <DaftarkasEntity> getdaftarkasArrayList() {
        return daftarkasArrayList;
    }

    public ArrayList<DaftarkasEntity>alldatakas() {
        return daftarkasArrayList;
    }

    @Override
    public void view() {
        for (DaftarkasEntity daftarkas : daftarkasArrayList) {
            System.out.println("========================================");
            System.out.println("NIP : " + daftarkas.getKaryawan().getNip() + "\nNama : " + daftarkas.getKaryawan().getNama()
                    + "\nPassword : " + daftarkas.getKaryawan().getPassword() + "\nNo.Telp : " + daftarkas.getKaryawan().getNo_telp()
                    + "\nTanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(daftarkas.getKaryawan().getTglLahir())
                    + "\nPosisi Kerja : "+Kasir_IsiEntity.posisikerja[daftarkas.getIndexPos()] + "\nIsVerified : ");
            if (daftarkas.isVerified() == false) {
                System.out.println("Belum Di Verifikasi Admin");
            } else {
                System.out.println("Telah Di Verifikasi");
            }
            System.out.println("========================================");
        }
    }
    
    @Override
    public int cekData(String nip, String password) {
        int loop = 0;
        if (daftarkasArrayList.size() == 0) {
            loop = -1; // data kosong
        } else {
            for (int i = 0; i < daftarkasArrayList.size(); i++) {
                if (daftarkasArrayList.get(i).getKaryawan().getNip().equals(nip)) {
                    loop = i;
                    break;
                } else {
                    loop = -2;
                }
            }
        }
        return loop;
    }

    public DaftarkasEntity showDaftarkas(int index) {
        return daftarkasArrayList.get(index);
    }

    public void updateIsVerified(int index, DaftarkasEntity daftarkasEntity) {
       daftarkasArrayList.set(index, daftarkasEntity);
    }
    
    public void HapusDataDaftar(int index){
        daftarkasArrayList.remove(index);
    }
}
