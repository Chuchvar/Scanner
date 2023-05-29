import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        double  a,b,c;
        Scanner world = new Scanner(System.in);
        System.out.println("Ведіть дробове число:");
        if (world.hasNextDouble()) {
            a = world.nextDouble();
            System.out.println("Ведіть дробове число:");
            if (world.hasNextDouble()) {
                b = world.nextDouble();
                System.out.println("Ведіть дробове число:");
                if (world.hasNextDouble()) {
                    c = world.nextDouble();
                    if (a>=b&&a>=c){
                        System.out.println("Найбільше дробове:"+a);
                    }
                    else if (b>=a&&b>=c){
                        System.out.println("Найбільше дробове:"+b);
                    }
                    else if (c>=a&&c>=b){
                        System.out.println("Найбільше дробове:"+c);
                    }
                }
                else
                    System.out.println("Не дроюове");
            }
            else
                System.out.println("Не дроюове");
        }
        else
            System.out.println("Не дроюове");
    }
}
