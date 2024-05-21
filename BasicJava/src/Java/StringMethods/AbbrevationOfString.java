package Java.StringMethods;

import java.util.Scanner;

public class AbbrevationOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Strig : ");
        String word = sc.nextLine();

        String  []spliteWord=word.split(" ");
        for(int i=0;i<spliteWord.length;i++){
            String name = spliteWord[i];
            System.out.print(name.charAt(0)+" ");
        }

    }
}
