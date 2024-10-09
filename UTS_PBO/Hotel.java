/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

import java.util.ArrayList;

/**
 *
 * @author MRvL
 */
public class Hotel{
    private ArrayList<Kamar> kamarList;
    private ArrayList<Reservasi> reservasiList;
    
    public Hotel(){
        kamarList = new ArrayList<>();
        reservasiList = new ArrayList<>();
        for(int i = 1; i <= 20; i++){
            kamarList.add(new Kamar(i));
        }
    }
    
    public void pesanKamar(int nomorKamar, String namaPelanggan){
        for(Kamar kamar : kamarList){
            if(kamar.getNomorKamar() == nomorKamar && kamar.Tersedia()){
               kamar.pesanKamar();
               reservasiList.add(new Reservasi(nomorKamar, namaPelanggan));
               System.out.println("Kamar " + nomorKamar + ", telah dipesan oleh : " + namaPelanggan);
               return;
            }
        }
        System.out.println("Kamar tidak tersedia.");
    }
    
    public void cekKetersediaan(){
        System.out.println("Kamar yang tersedia : ");
        for(Kamar kamar : kamarList){
            if(kamar.Tersedia()){
                System.out.println("Kamar " + kamar.getNomorKamar() + " tersedia.");
            }
        }
    }
    
    public void lihatReservasi(){
        if(reservasiList.isEmpty()){
            System.out.println("Tidak ada reservasi.");
            return;
        }
        
        System.out.println("Daftar Reservasi : ");
        for(Reservasi reservasi : reservasiList){
            
            System.out.println(reservasi.getDetail());
        }
    }
}
