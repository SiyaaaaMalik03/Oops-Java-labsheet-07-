import java.util.*;
public class Q8 {
 static int readNumber(Scanner s) throws NumberFormatException {
  System.out.print("Enter integer: "); return Integer.parseInt(s.nextLine());
 }
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  try { System.out.println("Number = "+readNumber(s)); }
  catch(NumberFormatException e) { System.out.println("Invalid integer."); }
  finally { s.close(); }
 }
}
