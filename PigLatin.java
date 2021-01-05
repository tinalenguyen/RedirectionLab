public class PigLatin {

    public static void main(String[] main){

    }

    public static String pigLatinSimple(String s){
      s = s.toLowerCase();
      if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'u'
          s.charAt(0) == 'i' || s.charAt(0) == 'o' ){
            return s +"hay";
          } else return s.substring(1) + s.charAt(0) +"ay";


    }


    public static String pigLatin(String s){



    }

    public static String pigLatinBest(String s){


    }



}
