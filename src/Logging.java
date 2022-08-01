import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Logging extends TransactionDecorator{
    public Logging(Transaction transaction) {
        this.transaction = transaction;
    }

    public String getDescription() {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss z yyyy");
        ZonedDateTime now = ZonedDateTime.now();

        String dateString = dtf.format(now);
        return "Logging @" + dateString + "->" + transaction.getDescription();
    }
}
