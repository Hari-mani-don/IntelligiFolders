package Java;

import java.util.Scanner;

public class copyArray {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number=sc.nextInt();
        int[] array = new int[number];
         int [] copyArray=new int[number];

        //input get
        for (int i=0;i<number;i++){
            System.out.print("Enter array[" +i+"]: ");
            array[i]=sc.nextInt();
        }

        //copy array
        for(int i=0;i<number;i++){
            copyArray[i]=array[i];
        }

        System.out.println("Copy array :");
        ouptut(copyArray);
    }
    static void ouptut(int array[]){

        for(int i =0;i<array.length;i++){
            System.out.print(array[i]+",");
        }
    }
}
