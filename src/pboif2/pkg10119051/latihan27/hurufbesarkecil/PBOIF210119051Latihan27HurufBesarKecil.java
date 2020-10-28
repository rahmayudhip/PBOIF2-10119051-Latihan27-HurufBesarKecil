/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119051.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author RYP
 * NAMA   : Rahmayudhi Prakoso
 * KELAS  : PBOIF2
 * NIM    : 10119051
 * Deskripsi Program : Program ini berisi program untuk  membedakan huruf besar dan huruf kecil
 */
public class PBOIF210119051Latihan27HurufBesarKecil {

    public static void besar(String kalimat){
        String strUpper = kalimat.toUpperCase();
        System.out.println("Huruf Besar: " + strUpper);
    }
    
    public static void kecil(String kalimat){
        String strLower = kalimat.toLowerCase();
        System.out.println("Huruf Besar: " + strLower);
    }
    
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String kalimat;
      
        System.out.print("Masukan Kalimat : ");
        kalimat = input.nextLine();
        System.out.println("");
        System.out.println("===== Hasil Formating =====");
        besar(kalimat);
        kecil(kalimat);
      
    }
    
}
