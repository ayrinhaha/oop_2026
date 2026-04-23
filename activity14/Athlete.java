import java.util.ArrayList;

/**
 * Represents an athlete participating in a tournament.
 * Demonstrates encapsulation, comparison, and deep copying.
 *
 * @author ayrinhaha
 */
public class Athlete implements Competitor, Comparable<Athlete>, Cloneable {

    private String name;
    private int score;
    private ArrayList<String> trophies;

    /**
     * Constructs an Athlete with a name and score.
     *
     * @param name  the athlete's name
     * @param score the athlete's score
     */
    public Athlete(String name, int score) {
        this.name = name;
        setScore(score); // use validation
        this.trophies = new ArrayList<>();
    }

    /**
     * Returns the athlete's name.
     *
     * @return name of the athlete
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the athlete's score.
     *
     * @return score of the athlete
     */
    public int getScore() {
        return score;
    }

    /**
     * Updates the athlete's score if valid.
     *
     * @param score the new score value
     */
    public void setScore(int score) {
        if (Competitor.isValidScore(score)) {
            this.score = score;
        } else {
            System.out.println("Invalid score. Must be between 0 and 100.");
        }
    }

    /**
     * Adds a trophy to the athlete's record.
     *
     * @param trophyName name of the trophy
     */
    public void addTrophy(String trophyName) {
        trophies.add(trophyName);
    }

    /**
     * Returns a copy of the trophies list to preserve encapsulation.
     *
     * @return a new list containing the athlete's trophies
     */
    public ArrayList<String> getTrophies() {
        return new ArrayList<>(trophies);
    }

    /**
     * Simulates the athlete playing a match.
     */
    @Override
    public void playMatch() {
        System.out.println(name + " is competing in the match!");
    }

    /**
     * Compares athletes by score (descending), then by name (ascending).
     *
     * @param other the athlete to compare with
     * @return comparison result
     */
    @Override
    public int compareTo(Athlete other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        }
        return this.name.compareTo(other.name);
    }

    /**
     * Creates a deep copy of this athlete.
     *
     * @return a cloned athlete with an independent trophies list
     */
    @Override
    public Athlete clone() {
        try {
            Athlete cloned = (Athlete) super.clone();
            cloned.trophies = new ArrayList<>(this.trophies);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed", e);
        }
    }

    /**
     * Returns a string representation of the athlete.
     *
     * @return formatted athlete details
     */
    @Override
    public String toString() {
        return "Athlete: " + name + " | Score: " + score + " | Trophies: " + trophies;
    }
}