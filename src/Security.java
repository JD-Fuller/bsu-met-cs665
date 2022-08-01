import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Security extends TransactionDecorator{
    public Security(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getDescription() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");
        ZonedDateTime now = ZonedDateTime.now();

        String dateString = dtf.format(now);
        return "Security check @" + dateString + "->" + transaction.getDescription();
    }
}
