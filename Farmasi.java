import java.util.Scanner;
public class Farmasi extends Barang {
public void tampil(){
String merek = "FLUDANE";
String harga = "RP 34,00";
String kadar = "10mg";
String jenis = "PATEN";
String tgl_transaksi = "01-01-2018";

System.out.println("");
System.out.println("FAKTUR TRANSAKSI ");
System.out.println("==============================");
Scanner input = new Scanner (System.in);
System.out.print("Kode :");
kode = input.nextLine();
Barang b = new Barang();
b.input ("Sanmol", "2", "kimia_farma");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("kadar :"+kadar);
System.out.println("jenis :"+jenis);
System.out.println("tgl_transaksi:"+tgl_transaksi);
System.out.println("---------------------------");
}
public void tampil2(){
String merek = "Sanmol";
String harga = "50 rb";
String kadar = "10mg";
String jenis = "generik";
Barang b = new Barang();
b.tampil ("FLUDANE", "1");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("kadar :"+kadar);
System.out.println("jenis :"+jenis);
}
}