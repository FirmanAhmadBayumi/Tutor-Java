/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugasprak3;

import java.util.Scanner;

/**
 *
 * @author Firman Ahmad Bayumi
 * @npm 2117051062
 * @kelas B
 */
public class Tugasprak3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        int limNilai;
        String hurufMutu;
        System.out.println("Input batas jumlah nilai yang akan dimasukkan : ");
        limNilai = input.nextInt();
        
        for(int i = 1; i <= limNilai; i++){
            System.out.println("Masukkan nilai ke-" + i +" : ");
            nilai = input.nextInt();
            
            if(nilai%10 == 0){
                continue;
            }
            
            if(nilai > 100){
                System.out.println("Nilai yang anda masukkan tidak sesuai!!!");
            }
            
            if(nilai >= 76) {
                hurufMutu = "A";
            }else if(nilai >= 71){
                hurufMutu = "B+";
            }else if(nilai >= 66){
                hurufMutu = "B";
            }else if(nilai >= 61){
                hurufMutu = "C+";
            }else if(nilai >= 56){
                hurufMutu = "C";
            }else if(nilai >= 51){
                hurufMutu = "D";
            }else{
                hurufMutu = "E";
            }
            
            switch(hurufMutu){
                case "A" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + "(Lulus)");
                    break;
                    
                case "B+" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Sangat Baik)");
                    break;
                    
                case "B" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Baik)");
                    break;
                    
                case "C+" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Cukup)");
                    break;
                    
                case "C" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Kurang)");
                    break;
                    
                case "D" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Sangat Kurang)");
                    break;
                    
                case "E" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Tidak Lulus)");
                    break;
                    
                default :
                    System.out.println("Nilai yang anda masukkan tidak sesuai");
            }
        }
        
    }
    
}
