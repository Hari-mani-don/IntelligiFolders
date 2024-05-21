package Java.StringMethods;

public class StringNullPractice {
    public static void main(String[] args) {
        char[] a={'2','3','\u0000'};
        int[] b ={1,2,3,4,'\0'};
        int count=0;
        while (b[count]!='\0')count++;
        System.out.println(count);

    }

}
