/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testingteamcity;

import java.util.Scanner;
import m1.Persegi;

/**
 *
 * @author affandeZone
 */
public class TestingTeamCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Scanner
        Scanner x = new Scanner(System.in);
        // Ambil Panjang dan Lebar
        System.out.print("Panjang: ");
        double p = x.nextDouble();
        System.out.print("Lebar: ");
        double l = x.nextDouble();
        // Buat persegi
        Persegi persegi = new Persegi(p,l);
        // Print luas
        System.out.println("Luas = " + persegi.getLuas());
    }
    
}
