public class Main {
public static void main (String [] args){
System.out.println("===============================");
System.out.println("-----PENJUALAN QPRO FARMASI--------");
System.out.println("===============================");


Login og = new Login();
og.input_LOGINCUST();
Admin adm = new Admin();
adm.input_Admin();
Farmasi e = new Farmasi();
e.tampil();
Transaksi T = new Transaksi();
T.input ("panadol", "1", "SANBEFARMA");
System.out.println("---------------------------");
Artikel ar = new Artikel();
ar.input_dis();

}
}