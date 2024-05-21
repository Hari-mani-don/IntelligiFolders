package Java.StringMethods;

import java.util.Arrays;

public class StringMethod {
    public static void main(String args[]){
            String a= "i love programming language";
            String b= new String(" Hari Mani dane dae").intern();



            System.out.println( "length  :"+ a.length());
            System.out.println( "trim  :"+ a.trim());
            System.out.println( "replace  :"+ a.replace("i","N"));
            System.out.println( "replaceAll  :"+ a.replaceAll("[dane]","0"));



//        String a= " Hari Mani dane dane";
//        String b= new String("abc");
        String c= new String("");
            System.out.println( "Empty  :"+ a.isEmpty());
            System.out.println( "isBlank  :"+ c.isBlank());
            System.out.println( "toUpperCase  :"+ a.toUpperCase());
            System.out.println( "toLowerCase  :"+ a.toLowerCase());
            System.out.println( "Equals  :"+ a.equals(b));
            System.out.println( "charAt  :"+ a.charAt(2));
            int e=10;
            System.out.println( "String.value  :"+ String.valueOf(10)+10);
            System.out.println( "compare  :"+ a.compareTo(b));
            System.out.println( "compareIgnoreCase  :"+ a.compareToIgnoreCase(b));
            System.out.println( "contains  :"+ a.contains("H"));
            System.out.println( "Concat  :"+ a.concat(b));
            System.out.println( "Concat  :"+ a.concat(b));
            System.out.println( "IndexOf  :"+ a.indexOf("a"));
            System.out.println( "LastIndexOf  :"+ a.lastIndexOf("a"));
            System.out.println( "subString  :"+ a.substring(8,10));
            char[] f= a.toCharArray();
            System.out.println( "toCharArray  :"+ Arrays.toString(f));
            System.out.println( "startWith  :"+ a.startsWith(" "));
            System.out.println( "EndsWith  :"+ a.endsWith(""));
            System.out.println( "hashCode  :"+ a.hashCode());
            System.out.println( "internEquals  :"+ (a==b));
            String[] sp=a.split(" ");
//            for(int i= sp.length-1;i>=0;i--){

//                if()\ char upper
        String upper;
                String array=sp[sp.length-1];
                for(int i=0;i<array.length();i++){
                    if(i==0) {
                        upper = array.substring(i).toUpperCase();

                        System.out.print(upper);
                    }else{
                        System.out.print(array.charAt(i));
                    }

                }
//            }
            System.out.print("\n");

            int g=10;
            int h=10;
            System.out.printf("%-10d %d",g,h);
//        String a= " Hari Mani dane dane";
//        String b= new String("abc");

//            System.out.print(a.isBlank());


      }
}
