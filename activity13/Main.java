/**
 * Main class used to demonstrate the use of generic classes:
 * Repository<T> and Result<T>.
 */
public class Main {

    /**
     * Entry point of the program.
     * Demonstrates:
     * 1. Generic Repository with String type
     * 2. Generic Repository with custom BankAccount type
     * 3. Wrapping output using Result<T>
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {

        Repository<String> guestRepo = new Repository<>();

        guestRepo.add("Raiden");
        guestRepo.add("Kazuha");
        guestRepo.add("Lisa");

        System.out.println("===== GUEST LIST =====");
        for (String guest : guestRepo.getAll()) {
            System.out.println("- " + guest);
        }

        Repository<BankAccount> accountRepo = new Repository<>();

        accountRepo.add(new BankAccount("Kamisato Ayaka", 5000));
        accountRepo.add(new BankAccount("Kujou Sara", 2192026.11));

        BankAccount selected = accountRepo.get(1);

        Result<BankAccount> result = new Result<>(selected, "Load Successful", true);

        result.display();
    }
}