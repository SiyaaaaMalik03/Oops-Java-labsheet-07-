import java.util.*;
public class Q1 {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  try { System.out.print("Numerator: "); int a=s.nextInt();
   System.out.print("Denominator: "); int b=s.nextInt();
   System.out.println("Result = "+a/b);
  } catch(ArithmeticException e) { System.out.println("Cannot divide by zero."); }
  finally { System.out.println("Operation finished."); s.close(); }
 }
}
