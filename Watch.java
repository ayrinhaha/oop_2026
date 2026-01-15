public class Watch {
    String color;
    int size;

    void printDetails() {
        System.out.printf("""
                %s %s
                """, color, size);
    }
}