wimport java.io.*;

class parent{
	parent(){
	System.out.println("parent");
	}
}
class child extends parent{
	child(){
	super();	
	}

	void m1()
	{
	 m2();
	}
	void m2() throws IOException
	{
	System.out.print("m1 successsful call");
	}
/*	public static void main(String [] args){
 		System.out.println("Hari i can execute main method");
		System.out.println("Hi hari");
	}
      static {
	System.out.println("hi hari");
	System.exit(0);*/
	final static int  test(){
	 System.out.println("This is the constructor");
	return 10;	
	}
	 int a=10;
	 int b=a;
        public static void main(String[] args) throws Exception{
		for(int i=0;i<100;i++){
			System.out.print("\rprocessing..."+i+"%");
			if(i<10){
			i=i+2;
			Thread.sleep(1000);
			}else if(i<50){
			i=i+5;
			Thread.sleep(900);
			}else if(i<80){
			i=i+2;
			Thread.sleep(2000);
			}else if(i==99)Thread.sleep(3000);
			else Thread.sleep(100);
		
		}
			System.out.println();
	}

}
