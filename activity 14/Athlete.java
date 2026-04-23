import java.util.ArrayList;

public class Athlete implements Competitor, Comparable<Athlete>, Cloneable {

    private String name;
    private int score;
    private ArrayList<String> trophies;

    public Athlete(String name, int score) {
        this.name = name;
        this.score = score;
        this.trophies = new ArrayList<>();
    }

    public void addTrophy(String trophyName) {
        this.trophies.add(trophyName);
    }

    @Override
    public void playMatch() {
        System.out.println(name + " is competing in the match!");
    }

    @Override
    public int compareTo(Athlete other) {
        if (this.score != other.score) {
            return Integer.compare(other.score, this.score);
        }
        return this.name.compareTo(other.name);
    }

    @Override
    protected Athlete clone() {
        try {
            Athlete cloned = (Athlete) super.clone();
            cloned.trophies = new ArrayList<>(this.trophies);
            return cloned;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed", e);
        }
    }

    @Override
    public String toString() {
        return String.format("Athlete: %-8s | Score: %-3d | Trophies: %s", name, score, trophies);
    }
}