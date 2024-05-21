package Java.StringMethods;

import java.util.Scanner;

public class StringReverseName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuffer buffer = new StringBuffer();
        System.out.print("Enter the Stirng : ");
        String words = sc.nextLine();
        String[] splite =words.split(" ");
        int k=0;

        while (splite.length>k){
            String word = splite[k];
            String add ="";
         for(int i=word.length()-1;i>=0;i--){
             add+=word.charAt(i);
         }
         buffer.append(add+" ");
         k++;
        }
        System.out.println(buffer);
    }
}
