/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belitiketkereta;
import java.util.Scanner;
/**
 *
 * @author GAMES
 */
public class BeliTiketKereta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    
        String jam; 
       String[] destinasi = {"Blitar", "Malang", "Surabaya"};
       String[] kode = {"BLT11", "MLG22", "SBY33"};
       int [] harga = {12000,20000,40000};
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pemesanan Tiket Kereta");
        System.out.println("Masukan Nama : ");
        String nama = input.nextLine();
        System.out.println("Masukan Nomor telepon :");
        String nomor = input.nextLine();
        
        System.out.println("Pilihan destinasi ");
        for (int a = 0; a<harga.length; a++){
            System.out.println(a+ ". "+destinasi[a]+ " harga tiket : RP."+harga[a]);
                 
        }
        System.out.println("Masukan Pilihan :  ");
        int pilihan = input.nextInt();
        if (pilihan==0){
            
            System.out.println("Harga tiket : "+harga[pilihan]);
            
        }else if (pilihan==2){
            
            System.out.println("Harga tiket : "+harga[pilihan]);
            
        }else if (pilihan == 3){
            
            System.out.println("Harga tiket : "+harga[pilihan]);
        }
        System.out.println("Pilihan Jam berangkat : ");
        System.out.println("1. 09:00");
        System.out.println("2. 13:00");
        System.out.println("3. 15:00");
        int b = input.nextInt();
        if (b==1){
            jam = "09:00";
            
        }else if (b==2){
            jam = "13:00";
        }else{ 
            jam = "15:00";
        }
        System.out.println("==============TIKET KERETA================");
        System.out.println("==========================================");
        System.out.println("Nama Customer : "+nama);
        System.out.println("Nomor Telp    :"+nomor);
        System.out.println("-------------------------------------------");
        System.out.println("Kode Tiket :"+kode[pilihan]);
        System.out.println("Jam Berangkat : "+jam);
        System.out.println("Harga Tiket : "+harga[pilihan]);
        System.out.println("===========================================");
                
    }
    
    
}
