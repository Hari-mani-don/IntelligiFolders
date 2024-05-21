package Java.Exception;
import java.util.Scanner;
public class ExceptionInputTask {
    public static void main(String[] args) {
        Encaps encaps = new Encaps();
       while (true) {
         int flag=0;
            Scanner sc = new Scanner(System.in);
            try {
                System.out.print("Enter your Name: ");
                encaps.setName(sc.nextLine());
                System.out.print("Enter your Phone Number: ");
                encaps.setPhone(sc.nextLong());
                System.out.print("Enter your Email: ");
                sc.nextLine();
                encaps.setMail(sc.nextLine());
            } catch (Exception e) {
                flag+=1;
            }
            if(flag==0){
                System.out.println(encaps.getName());;
                System.out.println(encaps.getPhone());
                System.out.println(encaps.getMail());
                break ;
            }
        }
        }
}
class Encaps{
  private  String name="\u0000";
  private  long phone=0;
  private  String mail="\0";

    public String getName() {
        return name;
    }

    public long getPhone() {
        return phone;
    }

    public String getMail() {
        return mail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

}
