import java.util.Scanner;
public class Bank {
    public static void main(String[] args) {
        int [][] database = new int[2][0];
        Scanner inData  = new Scanner(System.in);
        void openAccount(){
            resizeData();
            System.out.println("Enter your login:");
            int login = inData.nextInt();
            database[0][database[0].length - 1] = login;
            System.out.println("Count of money");
            database[1][database];
    }

        void resizeData(){
            int [][] addBase = new int[2][database[0].length+1/*потому что один ящик пустой*/];
            for (int a = 0; a < database.length; a++) {
                for (int b = 0; b < database[0].length; b++){
                    addBase[a][b] = database[a][b];
                }

            }

        }
        void show(){
            for(int a = 0; a < database.length; a++){
                for (int b = 0; b < database[0].length; b++){
                    System.out.print(database[a][b] + ", ");
                }
                System.out.println();
            }
        }
        void setMoney(){
            System.out.println("Enter your login to set money:");
            int login = inData.nextInt();
            System.out.println("Enter count of money:");
            int money = inData.nextInt();
            boolean isChanged = false;
            int index = -1;
            for(int a = 0; a < database[0].length; a++){
                if(database[0][a] == login){
                    database[1][a] = database[1][a] + money;
                    isChanged = true;
                }
            }
            if(isChanged){
                System.out.println("операция прошла успешно!");
            }else{
                System.out.println("убирайся");
            }

        }

    void getMoney(){
        System.out.println("Enter your login to get money:");
        int login = inData.nextInt();
        System.out.println("Enter count of money:");
        int money = inData.nextInt();
        boolean isChanged = false;
        int index = -1;
        for(int a = 0; a < database[0].length; a++){
            if(database[0][a] == login){
                database[1][a] = database[1][a] - money;
                isChanged = true;
            }
        }
        if(isChanged){
            System.out.println("операция прошла успешно!");
        }else{
            System.out.println("убирайся");
        }

    }



        /*int i;
        Bank () {
            i = 10;
        }
        */
    }
}
