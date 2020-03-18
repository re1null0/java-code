import java.util.Scanner;
import java.lang.Math;

public class Discriminant {
    public static void main(String[] args) {
        System.out.println("Введите a, b, c: ");
        Scanner a = new Scanner(System.in);
        int a1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        int b1 = b.nextInt();
        Scanner c = new Scanner(System.in);
        int c1 = c.nextInt();
        int d = (b1 * b1) - (4 * a1 * c1);

            if (d > 0){
                double x1 = ( -b1 + Math.sqrt(d)) / (-2 * a1);
                double x2 = ( -b1 - Math.sqrt(d)) / ( -2 * a1);
                System.out.println("x1: " + x1);
                System.out.println("x2: " + x2);
            }

            else if (d < 0){
                System.out.println("There is no solution");
            }

            else {
                double x = -b1 / (-2 * a1);
                System.out.println("x: " + x);
            }
    }

}





public class IfElse {
    public static void main(String[] args) {
        boolean rainy = false;
        if (rainy) {
            System.out.println("It is rainy");
            System.out.println("Take your jacket");
        } else {
            System.out.println("Its not rainy");

        }

        int a = 5;
        int b = 15;
        int c = 11;
        if (a > b) {
            System.out.println("a is bigger than a b");
        }
        else if (c > b) {
            System.out.println("c is bigger than a b");
        }

        else {
            System.out.println("b is the biggest");
        }


    }

}
