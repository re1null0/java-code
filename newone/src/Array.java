/*public class Array {
    public static void main(String[] args) {
        //int[] array = new int[5];
        //int array2 [] = new int[5];
        int[] array = {1, 4, 5, 6, 8, 9};
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
    }
}


public class Array {
    public static void main(String[] args) {
        //int[] array = new int[5];
        //int array2 [] = new int[5];
        int[] massiv = new int [3];
        massiv[0] = 89;
        massiv[1] = 564;
        massiv[2] = 45;
        for(int i =0; i <3 ; i++){
            System.out.println(massiv[i]);
        }

    }
}


public class Array {
    public static void main(String[] args) {
        int[] massiv = new int[1000];

        for (int i = 0; i < 1000; i++){
            if(i % 2 == 0){
                massiv[i] = i;
                System.out.println(massiv[i]);
            }

        }
    }
}

public class Array {
    public static void main(String[] args) {
        int[] i = {1, 2, 7, 9, 120, 16, 72};
        int indexmax = 0;
        int indexmin = 0  ;
        int max = i[0];
        int min = i[0];
        for(int c =1; c <7; c++ ){
            if(max < i[c]){
                max = i[c];
                indexmax = c;
            }
            if(max > i[c]){
                min = i[c];
                indexmin = c;
            }

        }i[indexmax] = min;
        i[indexmin] = max;
        for(int c =1; c <7; c++ ){
            System.out.println(i[c]+ "");
        }
    }
}
*/
import java.util.Scanner;
public class Array {
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
