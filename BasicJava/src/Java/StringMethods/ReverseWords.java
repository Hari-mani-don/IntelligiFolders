package Java.StringMethods;

public class ReverseWords {
    public static void main(String args[]){
        String word =" i love porgramming language";
        int count=0;
        for(int i=word.length()-1;i>=0;i--){
            if(word.charAt(i)==' '){
                for(int j=i+1;j<word.length();j++){
                    if(word.charAt(j)==' ') {
                        break;
                    }else{
                        if(count==0){
                            String upper="";
                            upper+=word.charAt(j);
                            System.out.print(upper.toUpperCase());
                            count++;
                        }else {
                            System.out.print(word.charAt(j));

                        }
                    }
                }
                count=0;
                System.out.print(" ");
            }
        }


    }
}
