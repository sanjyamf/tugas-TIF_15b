class Laporan extends barang {
public void cetak(){
System.out.println("====================================");
System.out.println(" FAKTUR");
System.out.println("=====================================");
Admin a = new Admin();
a.update_Admin();
Farmasi c = new Farmasi();
c.tampil2();
}
public void ubah_lap() {
}
public void hapus_lap(){ 
}
public void buat_lap(){
}
public boolean apakahHabis(){
return true;
}
}