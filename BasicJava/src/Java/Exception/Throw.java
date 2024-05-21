package Java.Exception;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) throws ArithmeticException{
           hari();
    }
    static void hari() {
try {
    Scanner sc = new Scanner(System.in);
    int value =sc.nextInt();
    int value1 =sc.nextInt();

    System.out.println(value/ value1);
}catch (ArithmeticException e){
    System.out.println(e);
}

//        }catch (Exception e){
//            System.out.println(e);
//        }
    }
}
