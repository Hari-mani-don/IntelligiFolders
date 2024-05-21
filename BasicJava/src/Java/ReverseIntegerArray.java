package Java;

import java.util.Scanner;

public class ReverseIntegerArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number=sc.nextInt();
        int[] array = new int[number];
        for (int i=0;i<number;i++){
            System.out.print("Enter array[" +i+"]: ");
            array[i]=sc.nextInt();

        }
        for (int i=number-1;i>=0;i--){
            System.out.println("array[" +i+"] = "+array[i]);
        }
    }
}
