package Java.Exception.ExceptionTask;

import java.awt.im.InputContext;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumberOfException extends Exception{
    Scanner sc = new Scanner(System.in);
    long phoneNO='\u0000';
    public static void main(String[] args) {
        PhoneNumberOfException p = new PhoneNumberOfException();
        p.phoneNumberCheck();
//        System.out.println( );
    }

    PhoneNumberOfException(String data){
        super(data);
    }PhoneNumberOfException(){

    }

   void phoneNumberCheck() {
       int flag = 0;
       while(flag==0) {

           try {

                   System.out.print("Enter your PhoneNO: ");
                   phoneNO = sc.nextLong();

//
               try {
                   if((int)Math.log10(phoneNO)+1 == 10) {
                       flag=1;
                   } else {
                       throw new PhoneNumberOfException("Please 10 digit provide");
                   }
               } catch (PhoneNumberOfException e) {
                   System.out.println(e);
               }

           } catch (InputMismatchException n) {
               try {
                   throw new PhoneNumberOfException("Please  provide digit only");
               } catch (PhoneNumberOfException pe) {
                   sc.next();
                   System.out.println(pe);
               }
           }catch (Exception e){
               System.out.println(e);
           }
       }
    }


}
