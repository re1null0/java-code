import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        int lineverticalnum;
        int linehorizantalnum;
        char linevertical = '|';
        char linehorizantal = '_';
        Scanner text = new Scanner(System.in);
        System.out.println("do u want to print rect");
        String  txt = text.nextLine();
        if(txt == "yes") {
            Scanner num = new Scanner(System.in);
            System.out.println("enter the number horizontal lines: ");
            int intege = num.nextInt();
            Scanner num1 = new Scanner(System.in);
            System.out.println("enter the number horizontal lines: ");
            int intege1 = num1.nextInt();
        }else {
            System.out.println("nichego");
        }
            for (int b = 0; b < intege1; b++) {
                System.out.println(linehorizantal);
            }
            for (int i = 0; i < intege; i++) {
                System.out.println(linevertical + "          ");
                for (int c = 0; c < intege; c++) {
                    System.out.println(linevertical);
                    if (i == 10) {
                        for (int b = 0; b < intege1; b++) {
                            System.out.print(linehorizantal);
                        }
                    }
                }
            }
    }
}

