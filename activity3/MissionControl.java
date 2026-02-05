public class MissionControl {
    public static void main(String[] args) {
        SecretAgent secretAgent = new SecretAgent("007", "James Bond", 5);

        System.out.println("AGENT STATUS:");
        System.out.println("ID: " + secretAgent.getAgentId());
        System.out.println("CODENAME: " + secretAgent.getCodeName());
       
        Mission mission = new Mission();
        
    }
    
}
