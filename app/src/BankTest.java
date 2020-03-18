import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Bank kaspi = new Bank();
        Scanner in = new Scanner(System.in);
        int operation;
        while (true){
            System.out.println("Choose from 1-4 operations: 1 - open account, 2 - set money, 3 - get money, 4 - show");
            operation = in.nextInt();
            switch (operation){
                case 1:
                    kaspi.openAccount();
                    break;
                case 2:
                    kaspi.setMoney();
                    break;
                case 3:
                    kaspi.getMoney();
                    break;
                case 4:
                    kaspi.show();
                    break;
                default:
                    System.out.println("Reenter the operation");
            }
        }

    }
}
