import java.util.ArrayList;

/**
 * Generic class for managing tournament participants.
 * Demonstrates the use of generics and encapsulation.
 *
 * @param <T> the type of participants in the tournament
 * 
 * @author ayrinhaha
 */
public class Tournament<T> {

    private ArrayList<T> participants;

    /**
     * Constructs an empty tournament.
     */
    public Tournament() {
        participants = new ArrayList<>();
    }

    /**
     * Adds a participant to the tournament.
     *
     * @param participant the participant to add
     */
    public void addParticipant(T participant) {
        participants.add(participant);
    }

    /**
     * Returns a copy of the participants list.
     * Prevents external modification of internal data.
     *
     * @return a new list containing all participants
     */
    public ArrayList<T> getParticipants() {
        return new ArrayList<>(participants);
    }

    /**
     * Displays all participants in the tournament.
     */
    public void showAll() {
        for (T participant : participants) {
            System.out.println(participant);
        }
    }
}