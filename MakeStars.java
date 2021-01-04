import java.util.*;
public class MakeStars {

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    String thing = " ";

    while (obj.hasNextLine() ){
        Scanner readLine = new Scanner(obj.nextLine() );
        while (readLine.hasNext()){
          String result = " ";
          thing = readLine.next();
          for (int i = 0 ; i < thing.length() ; i++ ){
            result += "*";

          }
          System.out.print(result + " ");
        }
    }


  }







}
