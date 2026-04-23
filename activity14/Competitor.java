/**
 * Represents a competitor in a tournament.
 * Defines required and optional behaviors for participants.
 *
 * @author ayrinhaha
 */
public interface Competitor {

    /**
     * Simulates the competitor playing a match.
     */
    void playMatch();

    /**
     * Reports the current status of the competitor.
     */
    default void reportStatus() {
        System.out.println("\n[Status] Competitor is ready for the next round.");
    }

    /**
     * Checks if a score is within the valid range.
     *
     * @param score the score to validate
     * @return true if score is between 0 and 100, otherwise false
     */
    static boolean isValidScore(int score) {
        return score >= 0 && score <= 100;
    }
}