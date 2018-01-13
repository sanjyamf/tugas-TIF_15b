import java.util.Scanner;
class Admin {
public String nama ;
public String pass;
public String jen ;
public String Namob,Ap ;

public void input_Admin(){
Scanner input = new Scanner (System.in);

pass = input.nextLine();
System.out.println("---------------------------");
System.out.println("===cek Barang == ");
System.out.println("------------------------");
System.out.println(" ----JENIS OBAT--- ");
System.out.println(" # PATEN   # Generik ");
System.out.println("------------------------");
System.out.print("Jenis obat :");
jen = input.nextLine();
System.out.print("Nama obat  :");
jen = input.nextLine();
System.out.print("No Id	   :");
jen = input.nextLine();
System.out.println("------------------------");
}
public void update_Admin(){
String nama = "sanjaya m faishal";
String id = "KK234";
System.out.println("Nama :"+nama);
System.out.println("Id :"+id);
System.out.println("Jen: "+jen);

}
}