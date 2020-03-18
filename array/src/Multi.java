public class Multi{
    public static void main(String[] args) {
        int [] [] arr = new int [3] [3];
        arr[0][0] = 1;
        arr[0][1] = 1;
        arr[0][2] = 1;
        arr[1][0] = 2;
        arr[1][1] = 2;
        arr[1][2] = 2;
        arr[2][0] = 3;
        arr[2][1] = 3;
        arr[2][2] = 3;

        /*for (int i =0; i < 5; i++){
            for (int k = 0; k < 10; k++){
                System.out.println("i""+i+", k="+k");
            }
        }
        */

        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                arr[row][column] = row;
            }
        }
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < 3; column++){
                System.out.print();
            }
        }
    }
}



public class Multi{
    public static void main(String[] args) {
        int [] [] arr = new int [3] [];
        arr[0] = new int[1];
        arr[1] = new int[2];
        arr[2] = new int [3];
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < row + 1; column++){
                arr[row][column] = column;
            }
        }
        for(int row = 0; row < 3; row++){
            for(int column = 0; column < row + 1; column++){
                System.out.print(arr[row][column]+"");
            }
            System.out.println();
        }

    }
}


public class Multi{
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        int i = 1;
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < 5; column++){
                arr[row][column] = i;
                i+=2;
            }
        }
        for(int row = 0; row < 5; row++){
            for(int column = 0; column < 5; column++){
                System.out.print(arr[row][column]+"");
            }
            System.out.println();
        }

    }
}



public class Multi{
    public static void main(String[] args) {
        stepen(a : 6, b :2);
    }
    public static void stepen(int a, int b){
        int chislo = 1;
        for(int i = 0; i < =b; i++){
            chislo = chislo * a;
        }
        System.out.println(chislo)
    }
}