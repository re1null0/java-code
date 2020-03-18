
import java.util.Scanner;
public class Combined {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextInt());
        int numnum = 68;
        for(int counter = 0; counter < 10; counter++ ){
            int guess = input.nextInt();
            if(numnum>guess) System.out.println("bigger");
            else if(numnum<guess) System.out.println("less");
            if (counter >10)
                System.out.println("loseer");
            break;
        }
        System.out.println("you did it");
    }
}





/*
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


public class DoWhiel {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 2000; i <= 10000000; i++){
            if (i % 17 == 0){
                sum+=i;
                System.out.println(sum);
            }
        }
    }


}

public class Klass {
    public static void main(String[] args) {
        int [] number = {20, 21, 22, 23, 47, 25, 26, 27, 28, 29};
        for(int element = 0; number[element++];){
            int sum = number[]/number.length;
            System.out.println(sum);
        }

    }

}



