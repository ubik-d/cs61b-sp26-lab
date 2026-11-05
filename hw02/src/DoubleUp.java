public class DoubleUp {
   /**
     * Returns a new string where each character of the given string is repeated twice.
     * Example: doubleUp("hello") -> "hheelllloo"
     */
   public static String doubleUp(String s) {
      String newstring="";
      for(int i=0;i<s.length();i++){
         newstring+=s.substring(i,i+1);
         newstring+=s.substring(i,i+1);

      }
      return newstring;
   }
   
   public static void main(String[] args) {
      String s = doubleUp("hello");
      System.out.println(s);
      
      System.out.println(doubleUp("cat"));
   }
}