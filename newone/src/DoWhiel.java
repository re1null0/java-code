/*public class DoWhiel {
    public static void main(String[] args) {

        for(int i = 0, b =0; i < 20; i++, b--) {
            System.out.println("hello ");
            System.out.println("b= "+b);

        }

    }
}


public class DoWhiel {
    public static void main(String[] args) {
        do{
            System.out.println("");
        }while (4 < 3);
    }
}


public class DoWhiel {
    public static void main(String[] args) {
        int counter = 0;
        do{

            counter++;
            System.out.println(counter);
        }while (counter < 12);
    }
}




public class DoWhiel {
    public static void main(String[] args) {
        int pass = 0;
        long diapazon = 2000;
        do{
            pass++;
            if(pass % 17 == 0){
                System.out.println(pass);
            }
            else{
                diapazon++;
            }

        }while(diapazon > 2000 && diapazon < 1000000000);
    }
}
*/

public class DoWhiel {
    public static void main(String[] args) {
        long sum = 0;
        for(int i = 2000; i <= 10000000; i++){
            if (i % 17 == 0){
                sum+=i;
                System.out.println(sum);
            }
        }
    }


}
