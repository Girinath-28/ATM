import java.util.TreeMap;

public class Customer {
    public boolean validAccountNumber(String accountNo, TreeMap<String, CustomerDatabase> db){
        if(accountNo.equals(db.get(accountNo).getAccountNo())){
            return true;
        }
        return false;
    }
    public boolean validPinNo(String accountNo, String pinNo, TreeMap<String, CustomerDatabase> db){
        if(pinNo.equals(db.get(accountNo).getPinNo())){
            return true;
        }
        return false;
    }
    public void transferAmount(String fromAccountNo, String toAccountNo, int amount, TreeMap<String, CustomerDatabase> db){
        db.get(fromAccountNo).withdraw(fromAccountNo, amount, db);
        db.get(toAccountNo).deposit(toAccountNo, amount, db);
    }
}
