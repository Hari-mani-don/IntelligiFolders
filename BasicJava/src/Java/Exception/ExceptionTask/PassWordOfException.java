package Java.Exception.ExceptionTask;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PassWordOfException extends Exception {
    Scanner sc = new Scanner(System.in);
    String passwords = "\u0000";
    public static void main(String[] args) {
        PassWordOfException p = new PassWordOfException();
        p.password();
    }
    PassWordOfException(){

    }PassWordOfException(String data){
        super(data);
    }
    void password() {
        int flag = 0;
        while (flag == 0) {
            System.out.print("Enter your Password: ");
            passwords = sc.nextLine();
            passwordCheck(passwords);
            try {
                if (passwords.length() >= 8) {
                    try {
                        if (passwordCheck(passwords)>=4) {
                          flag=1;
                        } else throw new PassWordOfException("please Provide password  one number,caps,small,special character > 8 letters");
                    } catch (PassWordOfException n) {
                        flag = 0;
                        System.out.println(n);
                    } catch (Exception n) {
                        System.out.println(n);
                    }
                } else {
                    throw new PassWordOfException("Please 8 character provide");
                }
            } catch (PassWordOfException p) {
                System.out.println(p);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    int passwordCheck(String pass){
        int count=0;
        int upper=0; int lower=0; int special=0; int number=0;
        for (int i=0;i<pass.length();i++){
            if((pass.charAt(i)>='A' && pass.charAt(i)<='Z') && upper==0){
                count++;
                upper++;
            }else if((pass.charAt(i)>='a' && pass.charAt(i)<='z') && lower==0){
                count++;
                lower++;
            }else if((pass.charAt(i)>='0' && pass.charAt(i)<='9') && number==0){
                count++;
                number++;
            }else if((pass.charAt(i)=='@'|| pass.charAt(i)=='#' || pass.charAt(i)=='&'||
                    pass.charAt(i)==')'||pass.charAt(i)=='('||pass.charAt(i)=='*' ||
                    pass.charAt(i)=='/' || pass.charAt(i)=='^'|| pass.charAt(i)=='$'||
                    pass.charAt(i)=='!' || pass.charAt(i)=='~' || pass.charAt(i)=='`' ||
                    pass.charAt(i)=='%'|| pass.charAt(i)=='.'||pass.charAt(i)=='+' ||pass.charAt(i)=='-'||
                   pass.charAt(i)=='_'|| pass.charAt(i)==','||pass.charAt(i)=='=' ||pass.charAt(i)=='<' ||
                        pass.charAt(i)=='>'|| pass.charAt(i)=='"'||pass.charAt(i)=='\'' || pass.charAt(i)==':' ||
                   pass.charAt(i)==';') && special==0 ){
                count++;
                special++;
            }
        }
        return count;
    }
}
