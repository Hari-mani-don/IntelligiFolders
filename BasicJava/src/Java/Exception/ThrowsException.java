package Java.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsException {
     void div() throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int name = sc.nextInt();
        System.out.print("Enter number2: ");
        int phone= sc.nextInt();
        int c=name/phone;
    }
    public static void main(String[] args) throws Exception {
        ThrowsException th = new ThrowsException();
         th.div();

    }
}
