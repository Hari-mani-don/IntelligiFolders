package Java;

import java.util.Arrays;

public class ArraysFillMethod {
    public static void main(String args[]) {
        char a[] = {'a', 'b', 'c'};
        char b[] = {'a', 'b', 'c'};
        Arrays.fill(b,'c');
        for(int i=0;i<b.length;i++){
            System.out.print(b[i]);
        }


}
}
