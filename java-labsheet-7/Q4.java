
public class Q4 {
 public static void main(String[] args) {
  int[] a={10,20,30};
  try {
   try { System.out.println(a[5]); }
   catch(ArrayIndexOutOfBoundsException e) { System.out.println("Invalid array index."); }
   System.out.println(100/0);
  } catch(ArithmeticException e) { System.out.println("Cannot divide by zero."); }
 }
}
