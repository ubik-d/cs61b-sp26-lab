import javax.print.DocFlavor;
import java.util.Stack;

public class PrintIndexed {
   /**
     * Prints each character of a given string followed by the reverse of its index.
     * Example: printIndexed("hello") -> h4e3l2l1o0
     */
   public static void printIndexed(String s) {
      String newstring ="";
      int sLength=s.length();
      for(int i=0;i<sLength;i++){
         newstring+=s.substring(i,i+1);
         newstring+=sLength-i-1;
      }
      IO.println(newstring);

   }

   public static void main(String[] args) {
      printIndexed("hello");
      printIndexed("cat"); // should print c2a1t0
   }
}