/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;

/**
 *
 * @author MRvL
 */
public class Customer implements Pengguna{
    private String nama;
    private Hotel hotel;
    
    public Customer(String nama, Hotel hotel){
        this.nama = nama;
        this.hotel = hotel;
    }

    @Override
    public void lihatDetail() {
        System.out.println("Reservasi atas Nama : " + nama);
    }

    public void pesanKamar(int nomorKamar) {
        hotel.pesanKamar(nomorKamar, nama);
    }
}
