import java.util.Scanner;

public class Coba {
     {
   

        // membuat variabel dan scanner
        boolean running = true;
        String nama,Ap,Ab,Ac,Ad ;
        String jawab;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner (System.in);

        while( running ) {
        
            System.out.println("-----Apakah anda sudah member?--------");
            System.out.println("--------------------------------------");
            System.out.print("Jawab [ya/tidak]> ");

            jawab = scan.nextLine();

            if( jawab.equalsIgnoreCase("Tidak") ){
                running = false;
            }


            
        }
        System.out.println("=====================");
        System.out.println("Form Member Baru");
        System.out.println("=====================");

    System.out.print("Input_Nama       :");
         Ap = scan.nextLine();

    System.out.print("Telepon           :");
         Ab = scan.nextLine();

    System.out.print("Alamat           :");
         Ac = scan.nextLine();

    System.out.print("buat_password    :");
         Ad = scan.nextLine();
      
System.out.println("--");
System.out.println("--");
System.out.println("--");
System.out.println("--");
System.out.println("--");
System.out.println("--");
System.out.println("--");

      System.out.println("------Anda sudah Menjadi member------");
      System.out.println("--------------------------------------");
      System.out.println("=======================================");
      System.out.println("NAMA   :  SANJAYA M FAISHAL ");
      System.out.println("NO ID  :  344456");


    }
}
