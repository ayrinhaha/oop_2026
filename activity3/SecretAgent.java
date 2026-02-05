
import java.time.LocalDateTime;

public class SecretAgent {

    //fields
    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletiontime;


    //constructor -  parameterized
    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        this.onMission = false;
        this.lastMissionCompletiontime = null;
    }

    //getters
    public String getAgentId() {
        return this.agentId;
    }

    public String getCodeName() {
        return this.codename;
    }

    public int getClearanceLevel() {
        return this.clearanceLevel;
    }

    public boolean isOnMission() {
        return this.isOnMission();
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return this.lastMissionCompletiontime;
    }


    //setters
    public void setCodename(String newCodename) {
        this.codename = newCodename;
    }

    public void setClearanceLevel(int level) {
        if (level >= 1 || level <= 5) {
            clearanceLevel++;
        } else {
            System.out.println("Invalid clearance level.");
        }
    }

    
    //behavioral methods
    public void startMission() {
        this.onMission = true;
    }

    public void  completeMission() {
        this.onMission = false;
    }

    public void lastMissionCompletiontime(){
        this.lastMissionCompletiontime = LocalDateTime.now();
    }
}

