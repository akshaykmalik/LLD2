package ADAPTER_DP.adapter;
import ADAPTER_DP.thirdPartyBank.*;
public class ICICIBankApiAdapter implements BankApiAdapter {
  @Override
  public double getAmount(String accountNumber) {
      ICICIBankApi icici = new ICICIBankApi();
      return icici.getBankBalance(accountNumber);
  }
  @Override
  public boolean transferMoney(String fromAccountNumber, String toAccountNumber, double amount) {
    ICICIBankApi icici = new ICICIBankApi();
    return icici.makePayment(
      fromAccountNumber, toAccountNumber, (float)amount ) == 1;
  }

}