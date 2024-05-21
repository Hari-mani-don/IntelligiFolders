package Java.Exception;


//import java.util.InputMismatchException;

public class throwsExcep {
    static  void hari(String a) throws Exception {
      if(a.length()>5){
          System.out.println("sucesses");
      }else {
          System.out.println("not success");
      }
        System.out.println("successfully");
    }
    public static void main(String[] args) {
        try {
            hari("12345234");
        }catch (Exception e){
            try{
                hari("123");
            }catch (Exception n){
                System.out.println("hari");
            }

        }
    }
}
