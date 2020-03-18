import java.util.Scanner;

public class Tree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of levels for New Year's tree: ");
        int n = scan.nextInt();
        int sum = 0;
        int toys = 0;
        for(int i = 1; i<=n; i++){
            toys = (2 * i)-1;
            sum += toys;
        }
        System.out.println(sum);
    }
}
