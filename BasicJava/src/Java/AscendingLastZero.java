package Java;

import java.util.Scanner;
public class AscendingLastZero{
    public  static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the array size: ");

            int number=sc.nextInt();
            int[] array = new int[number];
            int[] asc = new int[number];
            int count=0;
            int plus=0;

            //input get
            for (int i=0;i<number;i++){
                System.out.print("Enter array[" +i+"]: ");
                array[i]=sc.nextInt();

            }

            //Ascending order check
            for (int i=0;i<number;i++){  //5,2,1,0,5
                for(int j =i+1;j<number;j++){
                    if(array[i]!=0 && array[j]!=0) {
                        if (array[i] > array[j]) {
                            int value = array[i];
                            array[i] = array[j];
                            array[j] = value;
                        }
                    }
                }
                if(array[i]!=0){
                    asc[plus]=array[i];
                    plus++;
                }
            }
//            System.out.print(plus);
            for(int i =0;i<asc.length;i++){
                System.out.print(asc[i]);
            }


        }
    }

