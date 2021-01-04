import java.util.*;
public class MakeStars {

  public static void main(String[] args){
    Scanner obj = new Scanner(System.in);

    String result = " ";

    while (obj.hasNextLine() ){
        Scanner readLine = new Scanner(obj.nextLine() );
        while (readLine.hasNext()){
          for (int i = 0 ; i < readLine.next().length() ; i++ ){
            result += "*";

          }
          System.out.println(result + " ");
        }
        System.out.println();
    }
    obj.close();


  }







}
