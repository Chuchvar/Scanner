import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        String  a,b,c,d,e;
        Scanner world = new Scanner(System.in);
        System.out.println("Ведіть перше слово:");
        if (world.hasNextLine()) {
            a = world.nextLine();
            System.out.println("Ведіть друге слово:");
            if (world.hasNextLine()) {
                b = world.nextLine();
                System.out.println("Ведіть третє слово:");
                if (world.hasNextLine()) {
                    c = world.nextLine();
                    System.out.println("Ведіть четверте слово:");
                    if (world.hasNextLine()) {
                       d = world.nextLine();
                        System.out.println("Ведіть п'яте слово:");
                        if (world.hasNextLine()) {
                            e = world.nextLine();
                            a=a.substring(0,1);
                            b=b.substring(0,1);
                            c=c.substring(0,1);
                            d=d.substring(0,1);
                            e=e.substring(0,1);
                            System.out.println(a+" "+b+" "+c+" "+d+" "+e);
                        }
                    }
                }
            }
        }
    }
}
