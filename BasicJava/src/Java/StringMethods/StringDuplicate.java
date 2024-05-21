package Java.StringMethods;

import java.util.Scanner;

public class StringDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String a=sc.nextLine();

        char[] b =a.toCharArray();

        for (int i = 0; i < a.length(); i++) {
            int count = 0;

                for (int j = i+1; j < a.length(); j++) {
                    if (b[i] == b[j] && b[j]!=0) { //aabbccddaa
                        b[j]=0;
                        count++;
                    }
                }
                if (count > 0) {
                    System.out.println("Duplicate of " + b[i] + "\n" + "count =" + (count));

                }
                //
            }

    }
}
