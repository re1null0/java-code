
import java.util.Scanner;

public class Arsen {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        System.out.println("Enter the number of people that have applied for team:");
        int numberOfPlayers = scan.nextInt();
        if (numberOfPlayers % 11 == 0) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }



    }
}
