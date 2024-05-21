package Java;

import java.util.Arrays;

public class ArraysMisMatchMethod {
    public static void main(String args[]) {
        char a[] = {'a', 'b', 'c'};
        char b[] = {'a', 'c', 'c'};
        Arrays.mismatch(a, b);

        System.out.print(Arrays.mismatch(a, b));
    }
}
