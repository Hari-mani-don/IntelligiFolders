public class StaticBinding extends  Bike {
    int a  =20;

    void show( ){
        System.out.print("I am hari\n");

    }
    public static void main(String args[]){
//        Bike a = new Bike();
        Bike s = new StaticBinding();
//        Car b = new Car();

//        s.hari(b);
//        A  = new ();

        s.show();
        System.out.print(s.a);
    }
}
class Bike{
    int a  =10;

    void show(){
        System.out.print("I am bike");
    }
}
class Car extends  Bike{
    void show(){
        System.out.print("I am car");
    }
}
