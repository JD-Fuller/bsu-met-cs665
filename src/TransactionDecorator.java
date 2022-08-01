public abstract class TransactionDecorator extends Transaction {
    Transaction transaction;
    public abstract String getDescription();
}
