import  java.util.Scanner;


public class KrestikiNoliki {
    static char[][] table={
            {'_','_','_'},
            {'_','_','_'},
            {'_','_','_'}
    };
    public static void main(String[] args) {
        int row = 0;
        int row1 = 0;
        int column = 0;
        int column1 = 0;
        Scanner input = new Scanner(System.in);
        outConsole();


        boolean sw=true;
        while(true) {
            if(sw){
                System.out.println("Please enter yot move player x: ");
                System.out.println("Enter row of x:");
                row = input.nextInt() - 1;
                System.out.println("Enter column of x:");
                column = input.nextInt() - 1;
                if(row > 4 && column > 4){
                    System.out.println("Here only 3x3 table. Enter once again: ");
                }
                table[row][column]='x';

            }else{
                    System.out.println("Please enter yot move player o: ");
                    System.out.println("Enter row of o:");
                    row1 = input.nextInt() - 1;
                    System.out.println("Enter column of o:");
                    column1 = input.nextInt() - 1;
                    if(row == row1  && column == column1){
                        while(row != row1  && column != column1) {
                            System.out.println("Previous player already had take this place. Enter once again: ");
                            System.out.println("Enter row of o:");
                            row1 = input.nextInt() - 1;
                            System.out.println("Enter column of o:");
                            column1 = input.nextInt() - 1;
                            table[row1][column1]='o';
                        }
                    }
                    if(row1 > 4 && column1 > 4){
                        System.out.println("Here only 3x3 table. Enter once again: ");
                    }
                    table[row1][column1]='o';
                }
            }

            sw=!sw;
            outConsole();
            if(isWinner('x')){ break;}
            if(isWinner('o')){ break;}
        }

    }
    public static void outConsole(){
        for(int i=0;i<3;i++){
            for(int b=0;b<3;b++){
                System.out.print(table[i][b]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isWinner(char gamer){
        if(table[0][0]==gamer && table[1][0]==gamer && table[2][0]==gamer ||
                table[0][1]==gamer && table[1][1]==gamer && table[2][1]==gamer ||
                table[0][2]==gamer && table[1][2]==gamer && table[2][2]==gamer ||
                table[0][0]==gamer && table[0][1]==gamer && table[0][2]==gamer ||
                table[1][0]==gamer && table[1][1]==gamer && table[1][2]==gamer ||
                table[2][0]==gamer && table[2][1]==gamer && table[2][2]==gamer ||
                table[0][0]==gamer && table[1][1]==gamer && table[2][2]==gamer ||
                table[0][2]==gamer && table[1][1]==gamer && table[2][0]==gamer){
            System.out.println("Winner is "+ gamer);
            return true;
        }
        return false;
    }


}
