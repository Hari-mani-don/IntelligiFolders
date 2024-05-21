package Java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOutOfBoundException  {
    public static void main(String[] args) {

        try{
            int a[]={1,2,3,4,5};
            System.out.println(a[6]);
        }catch (Exception ab){
            System.out.println(ab);
        }

        try{
            String word="hari";
            System.out.println(word.charAt(7));
        }catch(Exception e){
            System.out.println(e);
        }

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the value: ");
            int hari =sc.nextInt();
            System.out.println(hari);
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Exception mismatch");

    }

}
