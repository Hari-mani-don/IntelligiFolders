package Java;

import java.util.Arrays;

public class ArraysEqual {
    public static void main(String args[]){
        char a[] ={'a','b','c'};
        char b[] ={'a','c','b'};

        System.out.print(Arrays.equals(a,b));
        char[] c = Arrays.copyOf(a,a.length);

        for(int i =0;i<c.length;i++){
            System.out.print(c[i]);
        }
    }
}
