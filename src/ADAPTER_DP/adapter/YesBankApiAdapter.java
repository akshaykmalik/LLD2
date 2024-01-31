package ADAPTER_DP.adapter;
public class YesBankApiAdapter implements BankApiAdapter {
    public double getAmount(String accountNumber) {
      return 0.0;
    }
  public  boolean transferMoney(String fromAccountNumber, String toAccountNumber, double amount)  {
    return true;
  }
}