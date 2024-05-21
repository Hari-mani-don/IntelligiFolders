package Java.Exception.ExceptionTask;

import java.util.Scanner;

public class MailOfException extends Exception{
    Scanner sc = new Scanner(System.in);
    String mail="\u0000";
    public static void main(String[] args) {
        MailOfException m = new MailOfException();
        m.Mail();
    }
    //constructor
    MailOfException(){

    }MailOfException(String data){
        super(data);
    }

    void Mail(){
        int flag = 0;
        while (flag==0) {
            System.out.print("Enter your mail: ");
            mail = sc.nextLine();
            try {
                if (specialCharacter(mail)==1) {
                    try {
                        if (mailCheck(mail)==1) {
                              flag=1;
                        } else throw new MailOfException(" change Mail Formate '@gmail.com'  ");
                    } catch (MailOfException n) {
                        System.out.println(n);
                    }catch (Exception n){
                        System.out.println(n);
                    }
                } else {
                    throw new MailOfException("Please mail formate change fist leter in character");
                }
            } catch (MailOfException e) {
                System.out.println(e);
            }catch (Exception e){
                System.out.println(e);
            }
        }


    }

    int mailCheck(String mail){

        String[] formatMail=mail.split("@");
        String mailFormate="gmail.com";
        for(int i=0;i<formatMail.length;i++){
            if(formatMail[i].equals(mailFormate)){
                return 1;
            }

        }
        return 0;
    }

   int specialCharacter(String mail){
       for (int i = 0; i < 1; i++) {
           if (mail.charAt(i) == '@' || mail.charAt(i) == '#' || mail.charAt(i) == '&' ||
                   mail.charAt(i) == ')' || mail.charAt(i) == '(' || mail.charAt(i) == '*' ||
                   mail.charAt(i) == '/' || mail.charAt(i) == '^' || mail.charAt(i) == '$' ||
                   mail.charAt(i) == '!' || mail.charAt(i) == '~' || mail.charAt(i) == '`' ||
                   mail.charAt(i) == '%' || mail.charAt(i) == '.' || mail.charAt(i) == '+' || mail.charAt(i) == '-' ||
                   mail.charAt(i) == '_' || mail.charAt(i) == ',' || mail.charAt(i) == '=' || mail.charAt(i) == '<' ||
                   mail.charAt(i) == '>' || mail.charAt(i) == '"' || mail.charAt(i) == '\'' || mail.charAt(i) == ':' ||
                   mail.charAt(i) == ';'){
                    return 0;
               }

       }
       return 1;

   }

}
