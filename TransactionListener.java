public interface TransactionListener {

    /**
     * The transaction process is in progress
     */
    void onLoading();

    /**
     * @param account returns the modified bank account
     */
    void onComplete(Bank account);

    /**
     * @param error returns the error message
     */
    void onError(String error);


}
