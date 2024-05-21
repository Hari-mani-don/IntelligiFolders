package HackerRankProblem;

public class paralellogoram {
    public static void main(String[] args) {
        int lenght =1;
        int breath =-3;

        if(lenght>=0 && breath >=0){
            System.out.print(lenght * breath);
        }else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
