public class Q5 {
 public static void main(String[] args) {
  System.out.println("Resource opened.");
  try { System.out.println(10/0); }
  catch(ArithmeticException e) { System.out.println("Exception occurred."); }
  finally { System.out.println("Resource closed."); }
 }
}

