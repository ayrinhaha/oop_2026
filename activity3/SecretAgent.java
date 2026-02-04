
import java.time.LocalDateTime;

public class SecretAgent {

    private String agentId;
    private String codename;
    private int clearanceLevel;
    private boolean onMission;
    private LocalDateTime lastMissionCompletiontime;



    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        onMission = false;
        lastMissionCompletiontime = null;
    }

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

    public void startMission() {
        onMission = true;
    }

    public void  completeMission() {
        onMission = false;
    }

    public void lastMissionCompletiontime(){
        LocalDateTime.now();
    }
}

