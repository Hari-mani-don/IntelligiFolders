package Java.Exception;

public class ThrowExceptionClass extends Exception{
    ThrowExceptionClass(String data){
       super(data);
    }
    static void hari(String name) throws ThrowExceptionClass{

           if (name.length() > 10) {
               System.out.println(name);
           }else{
               throw new ThrowExceptionClass("please >0 provide");
           }
    }
    public static void main(String[] args)  {
        try {
            hari("mani");
        } catch (ThrowExceptionClass e) {
            e.printStackTrace();
        }
        System.out.println("hi hari, Handle the Exception");
    }
}
