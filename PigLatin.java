public class PigLatin {

    public static void main(String[] main){

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
      for (int i = 0 ; i < digraphs.length ; i++){
        if (s.contains(digraphs[i] ) ) containDigraph = true;
      }
      if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'u' ||
          s.charAt(0) == 'i' || s.charAt(0) == 'o' ){
            return s +"hay";
      } else if (containDigraph == true){
        return s.substring(2) + s.substring(0,2) +"ay";
    } else return s.substring(1) + s.charAt(0) +"ay";

  }

    public static String pigLatinBest(String s){


    }



}
