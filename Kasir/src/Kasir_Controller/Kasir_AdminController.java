/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Controller;

import Kasir_Entity.Kasir_AdminEntity;
import Kasir_Entity.DaftarkasEntity;
import Kasir_Entity.Kasir_KaryawanEntity;
import java.util.ArrayList;
import java.util.Date;

public class Kasir_AdminController implements Kasir_ControllerInterface{
     int indexLogin = 0;
    
    public Kasir_AdminController(){
    }
    public void dataAdmin(){
        String nipAdmin [] = {"01","02"};
        String passwordAdmin [] = {"01","02"};
        String namaAdmin [] = {"agam","talitha"};
        String notelpAdmin [] = {"01","02"};
        String tglLahirAdmin [] = {"20/10/2000","30/01/2001"};
        String outlet [] = {"SBY","SBY"};
        for (int i = 0; i<nipAdmin.length; i++){
            Kasir_AllObjectModel.adminModel.insertAdmin(new Kasir_AdminEntity(nipAdmin[i], passwordAdmin[i], namaAdmin[i], notelpAdmin[i], new Date(tglLahirAdmin[i]), outlet[i]));
    }
   }
    public void viewAdmin(){
        Kasir_AllObjectModel.adminModel.view();
    }
    public void listPendaftarKaryawan(){
        Kasir_AllObjectModel.daftarkasModel.view();
    }
    @Override
    public void login(String nip , String password){
        indexLogin = Kasir_AllObjectModel.adminModel.cekData(nip,password);
    }
    public Kasir_AdminEntity adminEntity() {
        return Kasir_AllObjectModel.adminModel.showDataAdmin(indexLogin);
    }
    
    public void updateIsVerified(int index, int indexPos, Kasir_KaryawanEntity karyawanEntity) {
        Kasir_AllObjectModel.daftarkasModel.updateIsVerified(index, new DaftarkasEntity(karyawanEntity, true, indexPos));
    }

    public ArrayList<DaftarkasEntity>cekDaftarkasModel(){
       return Kasir_AllObjectModel.daftarkasModel.getdaftarkasArrayList();
}
  }
