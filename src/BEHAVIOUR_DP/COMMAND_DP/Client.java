package BEHAVIOUR_DP.COMMAND_DP;

public class Client {
    public static void main(String[] args) {
        Command indexProductsComm = new IndexProductsCommand();
        Command bulkUpdateComm = new BulkUpdateCommand();

        CommandLineRunner clr = new CommandLineRunner();
        clr.addCommands(indexProductsComm, bulkUpdateComm);
        clr.executeCommands();
    }
}
