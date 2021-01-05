import java.util.*;
public class PigLatin {

    public static void main(String[] main){
      Scanner obj = new Scanner(System.in);
      while (obj.hasNextLine() ){
        Scanner liner = new Scanner(obj.nextLine() );
        while (liner.hasNext()){
          System.out.print(pigLatinBest(liner.next())+" ");
        }
      }
    }

    public static String pigLatinSimple(String s){
      s = s.toLowerCase();
      if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'u'||
      s.charAt(0) == 'i' || s.charAt(0) == 'o' ){
            return s +"hay";
          } else return s.substring(1) + s.charAt(0) +"ay";


    }


    public static String pigLatin(String s){
      s = s.toLowerCase();
      boolean containDigraph = false;

      String[] digraphs = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
      if (s.length()>1 ){
       for (int i = 0 ; i < digraphs.length ; i++){
        if (s.substring(0, 2).contains(digraphs[i] ) ) {
          containDigraph = true;
          i = digraphs.length;
        }
      }
    }
      if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'u' ||
          s.charAt(0) == 'i' || s.charAt(0) == 'o' ){
            return s +"hay";
      } else if (containDigraph==true){
        return s.substring(2) + s.substring(0,2) +"ay";
    } else return s.substring(1) + s.charAt(0) +"ay";

  }

    public static String pigLatinBest(String s){
      s = s.toLowerCase();
      char lastChar = s.charAt(s.length()-1) ;
      //if first character ain't a letter
      if (!Character.isLetter(s.charAt(0)) ) return s;
      //accounts for punctuation
      else if (!Character.isLetterOrDigit(lastChar) ){
        return pigLatin(s.substring(0, s.length() -1) ) + lastChar;
      }
      else return pigLatin(s);

    }



}
