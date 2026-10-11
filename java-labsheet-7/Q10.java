class InsufficientFundsException extends Exception {
 InsufficientFundsException(String m) { super(m); }
}
class BankAccount {
 private double balance;
 BankAccount(double b) { balance=b; }
 void withdraw(double amount) throws InsufficientFundsException {
  if(amount<0) throw new IllegalArgumentException("Amount cannot be negative.");
  if(amount>balance) throw new InsufficientFundsException("Insufficient funds.");
  balance-=amount; System.out.println("Balance = "+balance);
 }
}
public class Q10 {
 public static void main(String[] args) {
  BankAccount b=new BankAccount(1000);
  try { b.withdraw(1200); }
  catch(InsufficientFundsException | IllegalArgumentException e) { System.out.println(e.getMessage()); }
 }
}

