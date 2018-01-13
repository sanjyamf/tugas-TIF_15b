public class Transaksi extends Barang{
public void tampil(){
String merek = "Sanmol";
String harga = "20rb";
String kadar = "2mg";
String jenis = "Paten";
Transaksi T = new Transaksi();
T.input ("panadol", "1", "Sanbe_farma");
System.out.println("---------------------------");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("---------------------------");
System.out.println("Kadar:"+kadar);
System.out.println("jenis :"+jenis);
System.out.println("---------------------------");
}
}