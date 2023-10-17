public class Main {

    public static void main(String[] args) {

        Bank account = new Bank(1000);

        // TODO : create and use a TransactionListener interface with onComplete method
        Transactions.withdraw(account, 100, new TransactionListener() {
            @Override
            public void onLoading() {
                System.out.println("Connecting to bank API...");
            }

            @Override
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %s%n", account.getTotal());
            }

            @Override
            public void onError(String error) {
                System.out.printf("Wihdraw error: %s%n", error);
            }
        });
    }
}
