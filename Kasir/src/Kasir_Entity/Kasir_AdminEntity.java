/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Entity;

import java.util.Date;
public class Kasir_AdminEntity extends KasirAbstractEntity{
    private String outlet;
    public Kasir_AdminEntity(String nip, String password, String nama, String no_telp, Date tglLahir, String outlet) {
        super(nip, password, nama, no_telp, tglLahir);
        this.outlet = outlet;
    }

    public Kasir_AdminEntity() {
    }
    

    @Override
    public String getNip() {
        return nip;
    }

    public String getOutlet() {
        return outlet;
    }

    public void setOutlet(String outlet) {
        this.outlet = outlet;
    }
}
