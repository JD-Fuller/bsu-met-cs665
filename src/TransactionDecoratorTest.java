public class TransactionDecoratorTest {

    static final String TESTING_PREFIX = "--Testing ";
    static final String TESTING_SOLO_END = " by itself--";
    static final String TESTING_LOGGING = "Logging";
    static final String TESTING_SECURITY = "Security";
    static final String TRANSACTION_DEPOSIT = "Deposit Transaction";
    static final String TRANSACTION_WITHDRAW = "Withdraw Transaction";
    static final String WITH = " with ";
    static final String AND = " and ";
    static final String TESTING_END = "--";

    public static void main(String args[]){
        Transaction transaction_dep1 = new DepositTransaction();
        Transaction transaction_dep2 = new DepositTransaction();
        Transaction transaction_dep3 = new DepositTransaction();
        Transaction transaction_with1 = new WithdrawTransaction();


        // Deposit Test by itself
        System.out.println(TESTING_PREFIX + TRANSACTION_DEPOSIT+TESTING_SOLO_END);
        System.out.println(transaction_dep1.getDescription());
        System.out.println('\n');


        //  Deposit test with Logging
        System.out.println(TESTING_PREFIX + TRANSACTION_DEPOSIT+WITH+TESTING_LOGGING+TESTING_END);
        transaction_dep1 = new Logging(transaction_dep1);
        System.out.println(transaction_dep1.getDescription());
        System.out.println('\n');

        // Deposit test with Security
        System.out.println(TESTING_PREFIX + TRANSACTION_DEPOSIT+WITH+TESTING_SECURITY+TESTING_END);
        transaction_dep2 = new Security(transaction_dep2);
        System.out.println(transaction_dep2.getDescription());
        System.out.println('\n');

        // Deposit test with Logging and Security
        System.out.println(TESTING_PREFIX + TRANSACTION_DEPOSIT+WITH+TESTING_LOGGING+AND+TESTING_SECURITY+TESTING_END);
        transaction_dep3 = new Security(transaction_dep3);
        transaction_dep3 = new Logging(transaction_dep3);
        System.out.println(transaction_dep3.getDescription());
        System.out.println('\n');

        // Withdraw test by itself
        System.out.println(TESTING_PREFIX + TRANSACTION_WITHDRAW+TESTING_SOLO_END);
        System.out.println(transaction_with1.getDescription());
        System.out.println('\n');

        // Withdraw test with Security and Logging
        System.out.println(TESTING_PREFIX + TRANSACTION_WITHDRAW+WITH+TESTING_SECURITY+AND+TESTING_LOGGING+TESTING_END);
        transaction_with1 = new Logging(transaction_with1);
        transaction_with1 = new Security(transaction_with1);
        System.out.println(transaction_with1.getDescription());
        System.out.println('\n');
    }
}
