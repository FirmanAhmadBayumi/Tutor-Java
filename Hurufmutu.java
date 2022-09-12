package hurufmutu;

import java.util.Scanner;

public class Hurufmutu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value;
        int limValue;
        String hurufMutu;
        System.out.println("Input batas jumlah nilai yang akan dimasukkan : ");
        limValue = input.nextInt();
        
        for(int i = 1; i <= limValue; i++){
            System.out.println("Masukkan nilai ke-" + i +" : ");
            value = input.nextInt();
            
            if(value%10 == 0){
                continue;
            }
            
            if(value > 100){
                System.out.println("Nilai yang anda masukkan tidak sesuai!!!");
            }
            
            if(value >= 76) {
                hurufMutu = "A";
            }else if(value >= 71){
                hurufMutu = "B+";
            }else if(value >= 66){
                hurufMutu = "B";
            }else if(value >= 61){
                hurufMutu = "C+";
            }else if(value >= 56){
                hurufMutu = "C";
            }else if(value >= 51){
                hurufMutu = "D";
            }else{
                hurufMutu = "E";
            }
            
            switch(hurufMutu){
                case "A" :
                    System.out.println("Huruf mutu yang didapatkan " + hurufMutu + " (Lulus)");
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
