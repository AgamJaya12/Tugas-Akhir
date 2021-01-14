/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Model;

import Kasir_Entity.Kasir_KaryawanEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


    public class Kasir_KaryawanModel implements ModelInterface {
    private ArrayList<Kasir_KaryawanEntity> karyawanArrayList;

    public Kasir_KaryawanModel() {
        karyawanArrayList = new ArrayList<Kasir_KaryawanEntity>();
    }
    
    public ArrayList <Kasir_KaryawanEntity> getkaryawanArraylist() {
        return karyawanArrayList;
    }

    public void insert(Kasir_KaryawanEntity kasir_karyawanEntity) {
        karyawanArrayList.add(kasir_karyawanEntity);
    }

    public void HapusData(int index){
        karyawanArrayList.remove(index);
    }
    
    @Override
    public void view() {
        for (Kasir_KaryawanEntity kasir_karyawanEntity : karyawanArrayList) {
            System.out.println("========================================");
            System.out.println("NIP : " + kasir_karyawanEntity.getNip() + "\nNama : " + kasir_karyawanEntity.getNama()
                    + "\nPassowrd : " + kasir_karyawanEntity.getPassword() + "\nNo.Telp : " + kasir_karyawanEntity.getNo_telp()
                    + "\nTanggal Lahir : " + new SimpleDateFormat("dd-MM-yyyy").format(kasir_karyawanEntity.getTglLahir()));
            System.out.println("========================================");
        }
    }
    
    
    @Override
    public int cekData(String nip, String password) {
        int loop = 0;
        while (!karyawanArrayList.get(loop).getNip().equals(nip)
                && !karyawanArrayList.get(loop).getPassword().equals(password)) {
            loop++;
        }
        return loop;
    }
    
//    public int cekData(String nip){
//        int cek = -1;
//        for(int i=0; i<karyawanArrayList.size();i++){
//            if(nip.equals(karyawanArrayList.get(i).getNip())){
//                cek = i;
//            }
//        }return cek;
//    }
    
    public Kasir_KaryawanEntity getKaryawanArrayList(int index) {
        return karyawanArrayList.get(index);
    }
}
