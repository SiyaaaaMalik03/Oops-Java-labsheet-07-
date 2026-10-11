import java.util.*;
public class Q2 {
 public static void main(String[] args) {
  int[] a={10,20,30,40,50}; Scanner s=new Scanner(System.in);
  try { System.out.print("Enter index 0-4: "); System.out.println(a[s.nextInt()]); }
  catch(ArrayIndexOutOfBoundsException e) { System.out.println("Invalid index."); }
  finally { s.close(); }
 }
}
