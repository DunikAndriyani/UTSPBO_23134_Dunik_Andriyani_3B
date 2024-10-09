/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UTS_PBO;
import java.util.Scanner;
/**
 *
 * @author MRvL
 */
public class Reservasi_Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Admin admin = new Admin(hotel);
        Customer customer = null;
        
        while(true){
            System.out.println("\n1. Login Admin");
            System.out.println("2. Login Pelanggan");
            System.out.println("3. Keluar");
            int pilihan = scanner.nextInt();
            
            switch (pilihan) {
                case 1 -> {
                    // Fungsionalitas Admin
                    System.out.println("Menu Admin:");
                    admin.cekKetersediaan();
                    admin.lihatDetail();
                }
                case 2 -> {
                    // Fungsionalitas Customer
                    System.out.print("Masukkan nama Anda: ");
                    String nama = scanner.next();
                    customer = new Customer(nama, hotel);
                    OUTER:
                    while (true) {
                        System.out.println("\n1. Pesan Kamar");
                        System.out.println("2. Lihat Detail");
                        System.out.println("3. Logout");
                        int pilihanPelanggan = scanner.nextInt();
                        switch (pilihanPelanggan) {
                            case 1 -> {
                                System.out.print("Masukkan nomor kamar yang ingin Anda pesan : ");
                                int nomorKamar = scanner.nextInt();
                                customer.pesanKamar(nomorKamar);
                            }
                            case 2 -> customer.lihatDetail();
                            default -> {
                                break OUTER;
                            }
                        }
                    }
                }
                
                case 3 -> {
                    System.out.println("Keluar");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid");
            }
        }
    }
}
