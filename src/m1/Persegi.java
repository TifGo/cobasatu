/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package m1;

/**
 *
 * @author affandeZone
 */
public class Persegi {
    
    // Atribut
    private double panjang;
    private double lebar;
    private double luas;
    
    // Konstruktor
    public Persegi(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = panjang * lebar;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public double getLuas() {
        return luas;
    }
    
    public void setLebar(double lebar) {
        if(lebar > 0) {
            this.lebar = lebar;
        }
        this.luas = this.panjang * this.lebar;
    }
    
}
