package Java.Exception.ExceptionTask;

import java.util.Scanner;

public class ExceptionMnnpTask {
    public static void main(String[] args) {
        nameOfExceptiion nameExcep= new nameOfExceptiion();
        MailOfException mail = new MailOfException();
        PassWordOfException pass = new PassWordOfException();
        PhoneNumberOfException phone = new PhoneNumberOfException();

        nameExcep.name();
        pass.password();
        phone.phoneNumberCheck();
        mail.Mail();

        System.out.println();

        System.out.println();
        System.out.println(nameExcep.name);
        System.out.println(pass.passwords);
        System.out.println(phone.phoneNO);
        System.out.println(mail.mail);
        System.out.println("\nSuccessfully Register");
    }
}
class nameOfExceptiion extends  Exception{

    nameOfExceptiion(String data){
        super(data);
    }
    nameOfExceptiion(){

    }
    Scanner sc = new Scanner(System.in);
    String name = "\u0000";
      void name() {
          int flag = 0;
          while (flag==0) {
              System.out.print("Enter your name: ");
              name = sc.nextLine();
              flag=1;
              try {
                  if (isUperCase(name.charAt(0)) == 0) {
                      try {
                          if (isLowerCase(name) == name.length() - 1) {

                          } else throw new nameOfExceptiion("Please small letter in after the First ");
                      } catch (nameOfExceptiion n) {
                          flag=0;
                          System.out.println(n);
                      }catch (Exception n){
                          System.out.println(n);
                      }
                  } else {
                      throw new nameOfExceptiion("Please First letter in caps");
                  }
              } catch (nameOfExceptiion e) {
                  flag=0;
                  System.out.println(e);
              }catch (Exception e){
                  System.out.println(e);
              }
          }
      }



    int isUperCase( char letter){
          if(letter>='A' && letter<='Z'){
              return 0;
          }else return 1;
    }
    int isLowerCase(String word){
          int count=0;
          for(int i=1;i<word.length();i++){
              if(word.charAt(i)>=97 && word.charAt(i)<=122){
                  count++;
              }else {
                  break;
              }
          }
          return count;
    }

}
