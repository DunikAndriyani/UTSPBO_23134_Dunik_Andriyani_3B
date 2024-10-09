/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS_PBO;
/**
 *
 * @author MRvL
 */

public class Kamar {
    private int nomorKamar;
    private boolean tersedia;
    
    public Kamar(int nomorKamar){
        this.nomorKamar = nomorKamar;
        this.tersedia = true;
    }
    
    public int getNomorKamar(){
        return nomorKamar;
    }
    
    public boolean Tersedia(){
        return tersedia;
    }
    
    public void pesanKamar(){
        tersedia = false;
    }
    
    public void batalPesan(){
        tersedia = true;
    }
}
