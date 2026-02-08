import java.time.format.DateTimeFormatter;

public class MissionControl {
    public static void main(String[] args) {

        // create an instance of SecretAgent
        SecretAgent secretAgent = new SecretAgent("007", "James Bond", 5);

        // print initial agent status
        System.out.println("AGENT STATUS:");
        System.out.println("ID: " + secretAgent.getAgentId());
        System.out.println("CODENAME: " + secretAgent.getCodeName());
        System.out.println();

        // create a new mission
        Mission mission = new Mission();

        // display mission briefing
        mission.displayMissionBriefing();
        System.out.println();

        // decision logic: check if agent clearance is enough
        if (secretAgent.getClearanceLevel() >= mission.getDifficulty()) {
            secretAgent.startMission();
            System.out.println("Agent " + secretAgent.getAgentId() + " is cleared for mission.");
        } else {
            System.out.println("Agent " + secretAgent.getAgentId() + "'s clearance is too low for this mission.");
            return; // stop execution if not cleared
        }

        // print updated agent status (on mission)
        System.out.println("On Mission: " + secretAgent.isOnMission());
        System.out.println();

        // simulate mission completion
        secretAgent.completeMission();

        // create a formatter for final completion time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy - hh:mm a");

        // print final agent status
        System.out.println("FINAL AGENT STATUS:");
        System.out.println("On Mission: " + secretAgent.isOnMission());
        System.out.println("Last mission completion time: " +
                secretAgent.getLastMissionCompletionTime().format(formatter));
    }
}
