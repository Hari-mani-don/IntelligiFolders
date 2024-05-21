package Java;

import java.util.Scanner;

public class FourthMaximumValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int number = sc.nextInt();
        int[] array = new int[number];


   int zero=0;
        for(int i = 0; i < number; ++i) {
            System.out.print("Enter array[" + i + "]: ");
            array[i] = sc.nextInt();
            zero+=array[i];

        }

        int max=array[0];
        int count=0;
        int increase=0;
        for(int i=0;i<4;i++){
            max=array[count];
            for(int j=0;j<array.length;j++){
//                if(max==00 && increase==0){
//                    count++;
//                    increase++;
//                    if(count<array.length){
//                        max=array[count];
//                    }
//                }
                if(array[j]>max && array[j]!=zero) {
                    max = array[j];
                 }
//                if(count<array.length){
//                if(array[count]==00 && increase==1){
//                    increase=0;
//                }
             }

            if(i<3) {
                for (int k = 0; k < array.length; k++) {
                    if (max == array[k]) {

                        array[k] = zero;
                    }

                }
            }
        }
        System.out.print(max);
    }
}
