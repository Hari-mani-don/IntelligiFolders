package Java;

public class FailMarkShow{

    public static void main(String args[]){

        int tamil=50;
        int eng =20;
        int math = 0;

        boolean t =tamil>35;
        boolean e =eng>35;
        boolean m =math>45;
        if(tamil>35 && eng>35 && math>35){
            System.out.println("all subject pass");
        }
        if(!t){
            System.out.println("tamil fail");
        }
        if(!e){
            System.out.println("English fail");
        }
        if(!m){
            System.out.println("Math fail");
        }
    }



}
