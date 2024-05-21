package Java;

import java.util.Scanner;

public class DuplicateValue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");

        int number=sc.nextInt();
        int[] array = new int[number];


        //input get
        for (int i=0;i<number;i++){
            System.out.print("Enter array[" +i+"]: ");
            array[i]=sc.nextInt();

        }

        for(int i =0;i<number;i++){  //2,4,2,4,1
            int count=1;
            for(int j=i+1;j<number;j++){

                    if (array[i] == array[j]) {
                            count++;
                            array[j] = 01;
                    }

            }
            if(count>=2 && array[i] != 01){
                System.out.print("\nduplicat value of ["+array[i]+"]");
                System.out.print("\t\nCount =  "+count);
                duplicate(count, array[i]);
            }
        }
        for(int i =0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    static void duplicate(int count,int value){
        System.out.print("\nvalue: ");
        for(int i =0;i<count;i++){
          System.out.print(value+",");
        }
    }
}
