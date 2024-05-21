package Java;

import java.util.Arrays;

public class ArraysBinarySearch {
    public static void main(String args[]){
        int a[]={2,5,1,4};
        Arrays.sort(a);
        for(int i =0;i<a.length;i++){
            System.out.print(a[i]);
        }
        System.out.print(Arrays.binarySearch(a,4));

    }
}
