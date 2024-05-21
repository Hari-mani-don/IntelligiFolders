package Java;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number=sc.nextInt();
        int[] array = new int[number];
        int sum =0;

        //input get
        for (int i=0;i<number;i++){
            System.out.print("Enter array[" +i+"]: ");
            array[i]=sc.nextInt();
            sum+=array[i];
        }

        //output
        System.out.print("\nsum of value: "+ sum);
    }
}
