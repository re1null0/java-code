

import java.util.ArrayList;
import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        System.out.println("enter the size of array x");
        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        ArrayList array  = new ArrayList();
        //array[y][y];
        System.out.println("enter the position ");
        System.out.println("enter the char ");
        int pos = scanner.nextInt();
        char ch = scanner.next();
        for(int i = 0; i>= y;i++){
            for(int i = 0; i>=y; i++){
                System.out.println(array[(int)pos/y][pos%y] = ch);
            }
        }


    }
}
