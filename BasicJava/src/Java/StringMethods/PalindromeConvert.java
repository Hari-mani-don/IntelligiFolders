package Java.StringMethods;

import java.util.Scanner;

public class PalindromeConvert {
    public static void main(String args[]){
         //pad->padap -> pda ->Hari _> HariraH

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Palindrome: ");
        String word = sc.nextLine();
        String reverse="";
        int count=word.length()-2;
        System.out.println(word+Reverse(word,reverse, count));

//      System.out.print(sub);
    }
    static String Reverse(String word, String reverse, int count){


        if(count<0) {
           return reverse;
        }
            reverse+=word.charAt(count);
            count--;
//           System.out.println(reverse);
       return  Reverse(word, reverse,count);
    }
}
