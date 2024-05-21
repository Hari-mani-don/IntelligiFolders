package Java;

import java.util.Scanner;

public class MissingNumber {
    public  static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number = sc.nextInt();
        int[] array = new int[number];


        //input get
        for (int i = 0; i < number; i++) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = sc.nextInt();

        }

        //Maxmimum number find
//        for (int i=0;i<number;i++){
//            for(int j =i+1;j<number;j++){
//                if(array[i]>array[j]){
//                    int value = array[i];
//                    array[i]=array[j];
//                    array[j]=value;
//                }
//            }
//        }

        for(int i =1;i<=10;i++){
            int count =0;
            for(int j=0;j<array.length;j++){
                if(i==array[j]){
                    count++;
                    break;
                }
            }
            if(count==0){

                System.out.print(i);
            }
        }
    }
}
