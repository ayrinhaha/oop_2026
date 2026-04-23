/**
 * A generic wrapper class used to standardize return results.
 * It holds data, a status message, and a success flag.
 *
 * @param <T> the type of data being wrapped
 */
public class Result<T> {

    private T data;
    private String message;
    private boolean isSuccess;

    /**
     * Constructs a Result object.
     *
     * @param data      the data to wrap
     * @param message   status message (e.g., "Success", "Failed")
     * @param isSuccess indicates whether the operation succeeded
     */
    public Result(T data, String message, boolean isSuccess) {
        this.data = data;
        this.message = message;
        this.isSuccess = isSuccess;
    }

    /** @return the wrapped data */
    public T getData() {
        return data;
    }

    /** @return the status message */
    public String getMessage() {
        return message;
    }

    /** @return true if operation is successful, false otherwise */
    public boolean isSuccess() {
        return isSuccess;
    }

    /**
     * Displays the result information in a readable format.
     */
    public void display() {
        System.out.println("\n===== RESULT OUTPUT =====");
        System.out.println("Status  : " + (isSuccess ? "SUCCESS" : "FAILED"));
        System.out.println("Message : " + message);

        System.out.println("\n======= ACCOUNT DATA =======");
        System.out.println(data != null ? data.toString() : "No Data");

    }
}