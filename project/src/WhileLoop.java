public class WhileLoop {
    public static void main(String[] args) {
        int age = 0;
        while(age<18){
            age++;
            System.out.println("your age is: "+age);
        }
        System.out.println("trial version of life is over");
    }
}

public class WhileLoop {
    public static void main(String[] args) {
        int hellocounter = 0;
        while(hellocounter != 100){
            System.out.println("Hola");
            hellocounter++;
        }
        System.out.println("thats all");
    }
}

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        long summa = 0;
        while(counter < 100){
            counter++;
            summa = summa + counter;
        }
        System.out.println("here we go");
    }
}


public class WhileLoop {
    public static void main(String[] args) {
        int dog = 100;
        int cat = 200;
        while(dog != cat){
            dog++;
            cat--;
        }
        System.out.println("they met ");
    }
}


public class Whileloop {
    public static void main(String[] args) {
        int min = 0;
        int hour = 0;
        while(hour != 8 && min != 15)  {
            min++;
            if (min == 60){
                hour++;
                min = 0;
            }

            System.out.println(hour+" : "+min);
        }
    }
}
