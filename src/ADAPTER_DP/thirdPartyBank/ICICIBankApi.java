package ADAPTER_DP.thirdPartyBank;

public class ICICIBankApi {
  public float getBankBalance(String accountNumber) {
      return 10.00f;
  }
  public int makePayment(String fromAccountNumber, String toAccountNumber, float amount) {
    return 1;
  }
}