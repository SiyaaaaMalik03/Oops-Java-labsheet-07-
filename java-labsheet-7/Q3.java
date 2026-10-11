import java.util.*;
public class Q3 {
 public static void main(String[] args) {
  Scanner s=new Scanner(System.in);
  try { int a=Integer.parseInt(s.nextLine()); int b=Integer.parseInt(s.nextLine());
   System.out.println("Result = "+a/b);
  } catch(NumberFormatException e) { System.out.println("Enter valid integers."); }
    catch(ArithmeticException e) { System.out.println("Cannot divide by zero."); }
  finally { s.close(); }
 }
}
