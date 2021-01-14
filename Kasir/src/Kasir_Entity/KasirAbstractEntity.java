/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Entity;

import java.util.Date;

public abstract class KasirAbstractEntity {
    protected String nip, nama, password, no_telp;
    protected Date tglLahir;

    public KasirAbstractEntity(String nip, String password, String nama, String no_telp, Date tglLahir) {
        this.nip = nip;
        this.nama = nama;
        this.password = password;
        this.no_telp = no_telp;
        this.tglLahir = tglLahir;
    }
    
    public KasirAbstractEntity(){
    }
    
    public abstract String getNip();

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir;
    }

    public String getPassword() {
        return password;
    }

    public String getNama() {
        return nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public Date getTglLahir() {
        return tglLahir;
    }
}
