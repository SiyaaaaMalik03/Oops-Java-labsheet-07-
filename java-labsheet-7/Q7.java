class InvalidPasswordException extends Exception {
 InvalidPasswordException(String msg) { super(msg); }
}
public class Q7 {
 static void check(String p) throws InvalidPasswordException {
  if(p.length()<6) throw new InvalidPasswordException("Password needs at least 6 characters.");
  System.out.println("Password accepted.");
 }
 public static void main(String[] args) {
  try { check("abc"); }
  catch(InvalidPasswordException e) { System.out.println(e.getMessage()); }
 }
}
