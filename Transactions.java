import java.util.Timer;
import java.util.TimerTask;

public class Transactions {

    public static void withdraw(Bank account, Integer value, TransactionListener event) {
        // loading begins
        event.onLoading();

        if (value == null) {
            // sends the error message and stops
            event.onError("Value is null");
            return;
        }

        int time = (int) (Math.random() * ((1000 - 500) + 1)) + 500;
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                account.setTotal(account.getTotal() - value);
                // sends the account
                event.onComplete(account);
            }
        }, time);
    }
}
