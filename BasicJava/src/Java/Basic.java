package Java;

import java.util.Scanner;

public class Basic {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String array[] = {"hari", "mani", "sibi","sahadevan","dinesh","prasanth"};
        for(int i = 0;;i++){
            System.out.println("Enter the number to get name:");
            int name = sc.nextInt();
            System.out.println("The name is "+array[name]);
        }
    }
}
