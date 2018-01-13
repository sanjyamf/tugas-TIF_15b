import java.util.Scanner;

public class Artikel  extends Barang{
     public void input_dis(){
     Scanner input = new Scanner (System.in);
   
        
        int belanjaan, diskon, bayar;
        String kartu,Total;
        System.out.println("---------------------------");
        System.out.print("APAKAH SUDAH JADI MEMBER ?: ");
        kartu = input.nextLine();
        System.out.println("---------------------------");
         System.out.println("JIKA MEMBER DIKENAKAN DISKON");
          System.out.println("---------------------------");
        System.out.print(" Total Pembayaran: ");
    
        belanjaan = input.nextInt();

       
        if (kartu.equalsIgnoreCase("ya")) {
            if (belanjaan > 50000) {
                diskon = 15000;
            } else if (belanjaan > 70000) {
                diskon = 20000;
            } else {
                diskon = 0;
            }

        } else {
            if (belanjaan > 10000) {
                diskon = 30000;
            } else {
                diskon = 0;
            }
        }

        // total yang harus dibayar
        bayar = belanjaan - diskon;

        
        System.out.println("---------------------------");
        System.out.println("Total Bayar: Rp " + bayar);
        System.out.println("---------------------------");
    } 
}