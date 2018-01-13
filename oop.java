public class Apotek extends Barang{
public void tampil(){
String merek = "ultraflu";
String harga = "10 rb";
String kandungan= "2mg";
String jenis = "generik";
Barang b = new Barang();
b.input ("generik", "2", "sply");
System.out.println("Merek :"+merek);
System.out.println("harga :"+harga);
System.out.println("warna :"+warna);
System.out.println("jenis :"+jenis);
}
}