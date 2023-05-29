import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String n,b,a,c,d,v;
        Scanner world = new Scanner(System.in);
        System.out.println("Ведіть перше слово:");
        if (world.hasNextLine()) {
            n = world.nextLine();
            System.out.println("Ведіть друге слово:");
            if (world.hasNextLine()) {
                b = world.nextLine();
                System.out.println("Ведіть третє слово:");
                if (world.hasNextLine()) {
                    a = world.nextLine();
                    System.out.println("Ведіть четверте слово:");
                    if (world.hasNextLine()) {
                        c = world.nextLine();
                        System.out.println("Ведіть п'яте слово:");
                        if (world.hasNextLine()) {
                            d = world.nextLine();
                            v=n.concat(" ").concat(b).concat(" ").concat(a).concat(" ").concat(c).concat(" ").concat(d);
                            System.out.println(v);
                        }
                    }
                }
            }
        }
        }
    }


