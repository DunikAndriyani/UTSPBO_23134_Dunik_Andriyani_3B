/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author MRvL
 */

interface Pengguna{
    void lihatDetail();
}

public class Admin implements Pengguna{
    private Hotel hotel;
    
    public Admin(Hotel hotel){
        this.hotel =  hotel;
    }
    
    @Override
    public void lihatDetail(){
        System.out.println("Menu Admin : Cek data reservasi.");
        hotel.lihatReservasi();
    }
    
    public void cekKetersediaan(){
        hotel.cekKetersediaan();
    }
}
