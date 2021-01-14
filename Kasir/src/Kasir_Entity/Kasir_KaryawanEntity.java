/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Entity;

import java.util.Date;
public class Kasir_KaryawanEntity extends KasirAbstractEntity {
   private String jeniskelamin;
   private String alamat;
   private int poskerja;
   public Kasir_KaryawanEntity(String nip, String password, String nama, String no_telp, Date tglLahir, String alamat,String jeniskelamin, int poskerja){
       super(nip, password, nama, no_telp, tglLahir);
       this.jeniskelamin = jeniskelamin;
       this.alamat = alamat;
       this.poskerja = poskerja;
   }
   
   @Override
   public String getNip(){
       return nip;
   }

    public String getJeniskelamin() {
        return jeniskelamin;
    }

    public void setJeniskelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
   
   public String getAlamat(){
       return alamat;
   }
   
   public void setalamat (String alamat){
       this.alamat = alamat;
   }

    public int getPoskerja() {
        return poskerja;
    }

    public void setPoskerja(int poskerja) {
        this.poskerja = poskerja;
    }
}
