package Java.InterviewQuestion;

public class interviewQuestionString {
    public  static void main(String args[]){


    String Rose = "harii";
    String mani = "MANI";

    System.out.println(Rose.toUpperCase());
    System.out.println(mani.toLowerCase());
//    System.out.println(Rose.contentEquals(mani));
//    System.out.println(Rose.matches(mani));
//    System.out.println(Rose.replaceFirst("i","b"));
//    System.out.println(Rose.);
      int count=0;
        for(int i =0;i<Rose.length();i++){
            String upper="";
            upper+=Rose.charAt(i);
            for(int j=0;j<mani.length();j++){
                String lower="";
                lower+=mani.charAt(j);

                for(int k=0;k<i;k++){
                    if(Rose.charAt(i)==Rose.charAt(k)){
                        count++;
                    }
                }
                if(lower.compareToIgnoreCase(upper)==0 && count==0){
                    System.out.print(Rose.charAt(i));
                    break;
                }
            }
        }

    }


}
