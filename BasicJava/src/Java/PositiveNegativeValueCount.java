package Java;

import java.util.Scanner;

public class PositiveNegativeValueCount {
    public  static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number=sc.nextInt();
        int[] array = new int[number];
        int pos =0;
        int neg=0;
        int zeroo=0;



        //input get
        for (int i=0;i<number;i++){
            System.out.print("Enter array[" +i+"]: ");
            array[i]=sc.nextInt();

        }

        //check positive negative zero
        for (int i=0;i<number;i++){
            if(array[i]>0) pos++;
            else if(array[i]<0) neg++;
            else if(array[i]==0) zeroo++;
            else System.out.print("please enter value error!");
        }

        int[] positive = new int[pos];
        int[] negative = new int[neg];
        int[] zero = new int[zeroo];

        int p=0;
        int n=0;
        int z=0;
        //value store positive negative zero
        for (int i=0;i<number;i++){
            if(array[i]>0){
                positive[p]=array[i];
                p++;
            }
            else if(array[i]<0){
                negative[n]=array[i];
                n++;
            }
            else if(array[i]==0){
                zero[z]=array[i];
                z++;
            }
            else System.out.print("please enter value error!");
        }





        //output
        System.out.print("\npositive value\n");
        System.out.print("count = "+ pos);
        System.out.println();
        ouptut(positive);
        System.out.print("\nNegative value\n");
        System.out.print("count = "+ neg);
        System.out.println();
        ouptut(negative);
        System.out.print("\nZero value\n");
        System.out.print("count = "+ zeroo);
        System.out.println();
        ouptut(zero);

    }
   static void ouptut(int array[]){
        int count =0;
        for(int i =0;i<array.length;i++){

            System.out.print(array[i]+",");
        }
    }
}
