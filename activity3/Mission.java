import java.time.LocalDate;
import java.util.Random;

public class Mission {

    // fields
    private String missionTarget;
    private LocalDate missionDeadline;
    private int difficulty;

    // constructor - not parameterized
    public Mission() {
        Random random = new Random(); // object
        String[] missionTargets = { "Retrieve stolen data", "Infiltrate enemy base", "Rescue hostage" };
        this.missionTarget = missionTargets[random.nextInt(missionTargets.length)];
        this.difficulty = (int) (Math.random() * 11); // randomized from 1-10
        int daysToAdd = random.nextInt(24) + 7; // 7 to 30 days
        this.missionDeadline = LocalDate.now().plusDays(daysToAdd);

    }


    //getters
    public String getMissionTarget(){
        return this.missionTarget;
    }

    public LocalDate getMissionDeadline(){
        return this.getMissionDeadline();

    }

    public int getDifficulty(){
        return this.getDifficulty();

    }
    
    
    public void diplayMissionBriefing(){
        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget );
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + missionDeadline);
    }
}