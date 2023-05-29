import java.util.Scanner;

public class Five {
    public static void main(String[] args) {
        String a, b;
        Scanner world = new Scanner(System.in);
        System.out.println("Ведіть слово:");
        if (world.hasNextLine()) {
            a = world.nextLine();
            System.out.println("Ведіть слово:");
            if (world.hasNextLine()) {
                b = world.nextLine();
                if (a.length() >= b.length()) {
                    System.out.println("Перший рядок більший");
                } else
                    System.out.println("Другий рядок більший");

            }
        }
    }
}
