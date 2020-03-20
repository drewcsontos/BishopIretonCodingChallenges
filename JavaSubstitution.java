import java.util.Arrays;
public class JavaSubstitution{
   private static final String alphabet = "abcdefghijklmnopqrstuvwxyz ";
   private static String sortKey(String key){
      int[] arr = new int[key.length()];
      for(int i=0;i<key.length();i++){
         arr[i]=(int) key.charAt(i);
      }
      Arrays.sort(arr);
      String newKey = "";
      for(int i=0;i<arr.length;i++)
         newKey+=(char) arr[i];
      newKey = newKey.toLowerCase();
      return newKey;
   }
   public static String decode(String key, String output){
      key=sortKey(key)+" ";
      String newOutput = "";
      char[] arr = new char[output.length()]; 
      for(int i=0;i<output.length();i++) 
         arr[i] = output.charAt(i); 
      for(char c : arr){
         if(alphabet.indexOf(c)!=-1)
         newOutput += alphabet.charAt(key.indexOf(c));
         else 
            newOutput+=c;
         }
      return newOutput;
   } 
   public static void main(String[] args){
      System.out.println(sortKey("NQhmgUXvfIWRosBkZclAejDtyp"));
      System.out.println(decode("NQhmgUXvfIWRosBkZclAejDtyp","ugs ignl vgok ugfgk qgk muwl eafv a iav?"));
   }
}