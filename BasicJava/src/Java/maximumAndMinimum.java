package Java;

import java.util.Scanner;

public class maximumAndMinimum {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number=sc.nextInt();
        int[] array = new int[number];

        int max =0;
        int min=0;
        //input get
        for (int i=0;i<number;i++){
            System.out.print("Enter array[" +i+"]: ");
            array[i]=sc.nextInt();

        }

        //maximum minimum check
        for (int i=0;i<number;i++){
            for(int j =i+1;j<number;j++){
                if(array[i]>array[j]){
                    int value = array[i];
                    array[i]=array[j];
                    array[j]=value;
                }
            }
        }
        for(int i =0;i<array.length;i++){
            System.out.print(array[i]);
        }
        System.out.println("maximum:"+array[number-1]);
        System.out.println("maximum:"+array[0]);

    }
}
