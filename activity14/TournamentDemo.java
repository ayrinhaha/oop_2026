import java.util.Collections;

public class TournamentDemo {
    public static void main(String[] args) {

        Tournament<Athlete> tournament = new Tournament<>();

        Athlete a1 = new Athlete("Kiko", 85);
        Athlete a2 = new Athlete("Diwata", 95);
        Athlete a3 = new Athlete("Bebang", 85);

        tournament.addParticipant(a1);
        tournament.addParticipant(a2);
        tournament.addParticipant(a3);

        System.out.println("--- Participants Before Sort ---");
        tournament.showAll();

        Collections.sort(tournament.getParticipants());

        System.out.println("\n--- Participants After Sort (Score Descending, Name Ascending) ---");
        tournament.showAll();

        System.out.println("\n--- Deep Copy Demonstration ---");
        Athlete original = new Athlete("Diana", 100);
        original.addTrophy("Gold Cup");

        Athlete clone = original.clone();
        clone.addTrophy("Silver Plate");

        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);

        System.out.println("\n--- Interface Method Tests ---");

        System.out.println("Is 105 a valid score? " + Competitor.isValidScore(105));
        System.out.println("Is 95 a valid score?  " + Competitor.isValidScore(95));

        a1.reportStatus();
        a1.playMatch();

    }
}
