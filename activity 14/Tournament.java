import java.util.ArrayList;

public class Tournament<T> {
    private ArrayList<T> participants = new ArrayList<>();

    public void addParticipant(T participant) {
        participants.add(participant);
    }

    public ArrayList<T> getParticipants() {
        return participants;
    }

    public void showAll() {
        for (T participants : participants) {
            System.out.println(participants.toString());
        }
    }
}
