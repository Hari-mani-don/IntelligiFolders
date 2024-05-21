package Java.StringMethods;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);


        System.out.print("Please Enter the String: ");
        String a = sc.nextLine();
        int count=0;
         int increse=0;
         int decrease =a.length()-1;
            for(int j=0;j<a.length();j++){
                if(a.charAt(increse) == a.charAt(decrease)) {
                    count++;
                }
                increse++;
                decrease--;
        }
        if(count==a.length()){
            System.out.print("The String is Palindrome");
        }else{
            System.out.print("The String is NOt Palindrome");
        }
    }
}
