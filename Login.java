import java.util.Scanner;
class Login {
public String nama ;
public String pass,Ap;
public String ID ,jen;
public void input_LOGINCUST(){
Scanner input = new Scanner (System.in);
System.out.println("LOGIN ADMIN/USER");
System.out.println("------------");
System.out.print("Nama :");
nama = input.nextLine();
System.out.print("Password :");
pass = input.nextLine();
System.out.print("no_id:");
jen = input.nextLine();
System.out.println("------------------------");
}
public void update_Login(){
String nama = "nama";
String pass = "Password";
String id ="id";
System.out.println("Nama :"+nama);
System.out.println("pass :"+pass);
System.out.println("Id: "+id);
}
}