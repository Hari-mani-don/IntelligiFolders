package Java.Exception;

import java.util.Scanner;

public class ExceptionTaskSiva {
    public static void main(String[] args) {
        hari();
        }
        static void hari(){
            Scanner sc = new Scanner(System.in);
            Encapsulate encaps = new Encapsulate();
            try {
                System.out.print("Enter your Name: ");
                String na =sc.nextLine();
                encaps.setName(na);

                System.out.print("Enter your Phone Number: ");
                long ph = sc.nextLong();
                encaps.setPhone(ph);

                System.out.print("Enter your Email: ");
                sc.nextLine();
                String em = sc.nextLine();
                encaps.setMail(em);
            } catch (Exception e) {
                  hari();
            }
            System.out.print("\n"+encaps.getName());
            System.out.print("\n"+encaps.getPhone());
            System.out.print("\n"+encaps.getMail());
        }
    }
    class Encapsulate{
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
