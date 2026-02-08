import java.time.LocalDateTime;

public class SecretAgent {

    // fields
    private String agentId;                 
    private String codename;                
    private int clearanceLevel;             
    private boolean onMission;              
    private LocalDateTime lastMissionCompletionTime; 

    // constructor
    public SecretAgent(String agentId, String codename, int clearanceLevel) {
        this.agentId = agentId;             
        this.codename = codename;           
        this.clearanceLevel = clearanceLevel;
        this.onMission = false;             
        this.lastMissionCompletionTime = null;
    }

    // getters
    public String getAgentId() {           
        return agentId;                      
    }

    public String getCodeName() {          
        return codename;                     
    }

    public int getClearanceLevel() {       
        return clearanceLevel;               
    }

    public boolean isOnMission() {         
        return onMission;                    
    }

    public LocalDateTime getLastMissionCompletionTime() {
        return lastMissionCompletionTime;    
    }

    // setters
    public void setCodename(String newCodename) {  
        this.codename = newCodename;               
    }

    public void setClearanceLevel(int level) {   
        if (level >= 1 && level <= 5) {           
            this.clearanceLevel = level;          
        } else {                                  
            System.out.println("Invalid clearance level"); 
        }
    }

    // behavioral methods
    public void startMission() {               
        this.onMission = true;                 
    }

    public void completeMission() {            
        this.onMission = false;                
        this.lastMissionCompletionTime = LocalDateTime.now(); 
    }
}
