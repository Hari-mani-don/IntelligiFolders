import java.util.Scanner;

public class Task3IfElse {

    public static void main(String[] args){
        Hari hari = new Hari();
        String smileyEmoji = "\uD83D\uDE04";
        hari.scan();
     int total =(int)  hari.Total();
     System.out.println("----------------------------------------------------------");
     System.out.println("\n\tYour are total Mark is:"+total);
     System.out.println("\tYour are Average Mark is:"+ hari.Average());
        int Average =(int)  hari.Average();
        if(hari.tamil>=35 && hari.english>=35 && hari.math>=35 &&hari.science>=35 && hari.social>=35){
            if (Average<100){
                hari.Grade(Average);
            }else {
                System.out.println("\n\tYou are Average is very high!!!! error"+smileyEmoji);
            }

        }else{
            System.out.println("\n\tYou are F Grade "+smileyEmoji);
        }
        System.out.println("----------------------------------------------------------");


    }
}
class Hari{
    int tamil;
    int english;
    int math;
    int science;
    int social;
    double avg;
    double total;
    Scanner scanner = new Scanner(System.in);

    void scan(){
    System.out.print("Enter tamil Mark:");
         tamil = scanner.nextInt();
    System.out.print("Enter English Mark:");
         english = scanner.nextInt();
    System.out.print("Enter Math Mark:");
         math = scanner.nextInt();
    System.out.print("Enter Science Mark:");
         science = scanner.nextInt();
    System.out.print("Enter Social Science Mark:");
         social = scanner.nextInt();
}
    double Total(){
        total = tamil + english + math + science + social;
        return total;
    }
    double Average(){
        avg =  total / 5;
        return avg;
    }
    void Grade(int Average){
        String smileyEmoji = "\uD83D\uDE04";


        if(Average>=35){
            System.out.println("\t\nYou are just pass"+smileyEmoji);
        } else if (Average>40) {
            System.out.println("\t\nYou are D Grade"+smileyEmoji);
        }else if (Average>60) {
            System.out.println("\t\nYou are C Grade"+smileyEmoji);
        }else if (Average>80) {
            System.out.println("\t\nYou are B Grade"+smileyEmoji);
        }else if (Average>90 && Average <=100) {
            System.out.println("\t\nYou are A Grade"+smileyEmoji);
        }else {
            System.out.println("\t\nyou are F Grade "+smileyEmoji);
        }
    }

}