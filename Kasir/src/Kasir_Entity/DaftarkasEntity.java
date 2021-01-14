/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Entity;

/**
 *
 * @author DELL
 */
public class DaftarkasEntity {
    private Kasir_KaryawanEntity karyawan;
    private boolean isVerified;
    private int indexposkerja;
   
    public DaftarkasEntity(Kasir_KaryawanEntity karyawan, boolean isVerified, int indexposkerja) {
        this.karyawan = karyawan;
        this.isVerified = isVerified;
        this.indexposkerja = indexposkerja;
    }
    
    public Kasir_KaryawanEntity getKaryawan() {
        return karyawan;
    }

    public void setKaryawan(Kasir_KaryawanEntity karyawan) {
        this.karyawan = karyawan;
    }
    

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean Verified) {
        isVerified = Verified;
    }

    public int getIndexPos() {
        return indexposkerja;
    }

    public void setIndexPoskerja(int indexposkerja) {
        this.indexposkerja = indexposkerja;
    }
   
}
