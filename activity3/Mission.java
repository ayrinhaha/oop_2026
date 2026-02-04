import java.time.LocalDate;

public class Mission {
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty = (int) (Math.random() * 11 - 1);
}