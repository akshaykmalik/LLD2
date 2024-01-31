package ADAPTER_DP.adapter;
public interface BankApiAdapter {
  double getAmount(String accountNumber) ;
  boolean transferMoney(String fromAccountNumber, String toAccountNumber, double amount);
}