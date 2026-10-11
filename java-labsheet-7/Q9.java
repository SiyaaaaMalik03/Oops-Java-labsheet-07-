public class Q9 {
 static int value() {
  try { return 10; }
  finally { System.out.println("Finally executes before the method returns."); }
 }
 public static void main(String[] args) { System.out.println("Value = "+value()); }
}
