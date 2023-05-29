import java.util.Scanner;

public class Four {
    public static void main(String[] args) {
        String a,b;
        Scanner world = new Scanner(System.in);
        System.out.println("Ведіть слово:");
        if (world.hasNextLine()) {
            a = world.nextLine();
            System.out.println("Ведіть слово(раджено з великої літери):");
            if (world.hasNextLine()) {
                b = world.nextLine();
                if (a.equalsIgnoreCase(b)){
                    System.out.println("Вони подібні");
                }
                else
                    System.out.println("Не подібні");
            }
        }
    }

}
