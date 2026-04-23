import java.util.ArrayList;
import java.util.Collections;

/**
 * Demonstrates the functionality of the tournament system.
 * Includes sorting, cloning, and interface method usage.
 *
 * @author ayrinhaha
 */
public class TournamentDemo {

    /**
     * Main method to run the program.
     *
     * @param args comman" ==== ine arguments
     */
    public static void main(String[] args) {

        Tournament<Athlete> tournament = new Tournament<>();

        Athlete a1 = new Athlete("Kiko", 85);
        Athlete a2 = new Athlete("Diwata", 95);
        Athlete a3 = new Athlete("Bebang", 85);

        tournament.addParticipant(a1);
        tournament.addParticipant(a2);
        tournament.addParticipant(a3);

        System.out.println("==== Participants Before Sorting ====" );
        tournament.showAll();

        // Get copy, sort it, then display
        ArrayList<Athlete> sortedList = tournament.getParticipants();
        Collections.sort(sortedList);

        System.out.println("\n ==== Participants After Sorting (Score Descending, Name Ascending) ====" );
        for (Athlete a : sortedList) {
            System.out.println(a);
        }

        System.out.println("\n==== Deep Copy Demonstration ====" );
        Athlete original = new Athlete("Anne", 100);
        original.addTrophy("Gold");

        Athlete clone = original.clone();
        clone.addTrophy("Silver");

        System.out.println("Original: " + original);
        System.out.println("Clone:    " + clone);

        System.out.println("\n==== Interface Method Test ====" );

        System.out.println("Is 105 a valid score? " + Competitor.isValidScore(105));
        System.out.println("Is 95 a valid score?  " + Competitor.isValidScore(95));

        a1.reportStatus();
        a1.playMatch();
    }
}