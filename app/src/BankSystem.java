import java.util.Scanner;
public class BankSystem {
    public static void main(String[] args) {
        int ank;
        System.out.println("Hello. Welcome to Worldwide Bank System.");
        System.out.println("You can choose from 3 banks: 1. KASPI Bank,   2.Forte Bank,  3.Tsesna Bank");
        Scanner sc = new Scanner(System.in);
        ank = sc.nextInt();
        switch (ank){
            case 1 :
                System.out.println("You choose KASPI bank.");
                break;
            case 2:
                System.out.println("You choose Forte bank.");
                break;
            case 3:
                System.out.println("You choose Tsesna bank.");
                break;
            default:
                break;
        }
        System.out.println("Now, choose an option : 1 - open account, 2 - set money, 3 - get money,  4 - show");
        Scanner sc = new Scanner(System.in);
        int [][] dbase = new int{{100567, 5678798}, {2}};
        Scanner input;
        int option = sc.nextInt();
        switch (option){
            case 1 :
                System.out.println("Your account is open");
                void account(){
                    System.out.println("Enter your login: ");
                    Scanner sc = new Scanner(System.in);
                    int login = input.nextInt();
                    int counter = 0;
                    boolean isEqual = false;
                    for(int i : dbase[0]){
                        if (i == login){
                            isEqual = true;
                            break;
                        }
                        counter++;
                    }
                        if(isEqual){
                            System.out.println("Enter t");
                        }

        }
            break;
            case 2:
                System.out.println("You can set money ");
                account();
                System.out.println("Enter the amount of money you want to set");
                Scanner sc = new Scanner(System.in);
                int money = input.nextInt();
                break;
            case 3:
                System.out.println("You can get money");
                break;
            default:

                break;
        }
    }
}
