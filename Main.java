public class Main {
    public static void main(String[] args) {

        Watch obj1 = new Watch();
        obj1.color = "Silver";
        obj1.size = 45;

        Watch obj2 = new Watch();
        obj2.color = "White";
        obj2.size = 38;

        obj1.printDetails();
        obj2.printDetails();

    }
}