package Java.StringMethods;

public class MustakTask {
    public static void main(String [] args){
        String name = "Hari one of the Developer";
        String[] splites = name.split(" ");
        for (int i = 0; i < splites.length; i++){
            String word=splites[i];
            if(word.equals("one")){
                for(int j=0;j<word.length();j++){
                    if(j==word.length()-1)
                    System.out.print(word.charAt(word.length()-1));
                    System.out.println();
                }
        }
            if(word.equals("the")){
                for(int j=0;j<word.length()-1;j++){
                    System.out.print(word.charAt(j));
                }
            }

            if(word.equals("Developer")){
                System.out.println();
                for(int j=0;j<word.length();j++){
                    if(j!=0 && j!=word.length()-1)
                    System.out.print(word.charAt(j));
                }
            }

    }
    }
}
