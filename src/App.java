import ADAPTER_DP.adapter.*;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        System.out.println("Hello world!");
        BankApiAdapter baa = AdapterFactory.getBankApiAdapter(ValidBank.ICICI);
        System.out.println("bank balance : "+ baa.getAmount("123456"));
        System.out.println("is money transfered: "+baa.transferMoney("123456", "654321", 10.45));
    }
}
