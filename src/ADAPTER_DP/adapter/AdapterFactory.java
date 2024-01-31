package ADAPTER_DP.adapter;

public class AdapterFactory {
  public static BankApiAdapter getBankApiAdapter(ValidBank bank) {
    switch(bank) {
      case ICICI : return new ICICIBankApiAdapter();
      case YES_BANK : return new YesBankApiAdapter();
      default : return null;
    }
  }
}