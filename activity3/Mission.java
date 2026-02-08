import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class Mission {

    // fields
    private String missionTarget;         
    private LocalDate missionDeadline;    
    private int difficulty;               

    // constructor
    public Mission() {
        Random random = new Random();     

        // possible mission targets
        String[] missionTargets = {
            "Retrieve stolen data",
            "Infiltrate enemy base",
            "Rescue hostage"
        };

        // choose random target
        this.missionTarget = missionTargets[random.nextInt(missionTargets.length)];

        // set random difficulty 1-10
        this.difficulty = random.nextInt(10) + 1;

        // set random deadline 7-30 days from now
        int daysToAdd = random.nextInt(24) + 7;
        this.missionDeadline = LocalDate.now().plusDays(daysToAdd);
    }

    // getters
    public String getMissionTarget() {   
        return missionTarget;              
    }

    public LocalDate getMissionDeadline() { 
        return missionDeadline;            
    }

    public int getDifficulty() {          
        return difficulty;                 
    }

    // display mission briefing
    public void displayMissionBriefing() {
        // format deadline nicely
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");

        System.out.println("*** MISSION BRIEFING ***");
        System.out.println("Target: " + missionTarget);
        System.out.println("Difficulty: " + difficulty);
        System.out.println("Deadline: " + missionDeadline.format(formatter));
    }
}
