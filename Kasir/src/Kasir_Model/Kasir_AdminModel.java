/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir_Model;

import Kasir_Entity.Kasir_AdminEntity;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Kasir_AdminModel implements ModelInterface{
    private ArrayList<Kasir_AdminEntity> adminEntityArrayList;
    
    public Kasir_AdminModel() {
        adminEntityArrayList = new ArrayList<Kasir_AdminEntity>();
    }
    
    public void insertAdmin(Kasir_AdminEntity Admin) {
        adminEntityArrayList.add(Admin);
    }

    @Override
    public void view() {
        for (Kasir_AdminEntity adminEntity : adminEntityArrayList) {
            System.out.println(adminEntity.getNip());
            System.out.println(adminEntity.getNama());
            System.out.println(adminEntity.getPassword());
            System.out.println(adminEntity.getNo_telp());
            System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(adminEntity.getTglLahir()));
        }
    }

    @Override
    public int cekData(String nip, String password) {
        int loop = 0;
        for (Kasir_AdminEntity adminEntity : adminEntityArrayList) {
            if (adminEntity.getNip().equals(nip) && adminEntity.getPassword().equals(password)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public Kasir_AdminEntity showDataAdmin(int index) {
        return adminEntityArrayList.get(index);
    }
}
