/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author MRvL
 */
public class Reservasi{
    private int nomorKamar;
    private String namaPelanggan;
    
    public Reservasi(int nomorKamar, String namaPelanggan){
        this.nomorKamar = nomorKamar;
        this.namaPelanggan = namaPelanggan;
    }
    
    public String getDetail(){
        return "Nomor kamar : " + nomorKamar + ", Reservasi atas Nama : " + namaPelanggan;
    }
}
