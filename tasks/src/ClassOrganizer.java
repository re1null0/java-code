import java.util.ArrayList;
import java.util.Scanner;
public class ClassOrganizer {
    public static void main(String[] args) {
        ArrayList<String> classA = new ArrayList<>();
        ArrayList<String> classB = new ArrayList<>();
        ArrayList<String> classC = new ArrayList<>();
        String name;
        float grade;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i<5; i++) /*while(classA.size() != 5)*/{
            System.out.println("Please enter the name of pupil(count of pupils shouldn't be more than 5): ");
            name = scan.next();
            System.out.println("Now enter your average grade for this academic year:");
            grade = scan.nextFloat();
            if (grade >=4.5 && grade <= 5) {
                classA.add(name);
                System.out.println("You entered A class");
            }
            else if (grade > 3 && grade <= 4.4) {
                classB.add(name);
                System.out.println("You entered B class");
            }
            else if (grade>= 2 && grade <= 3 ){
                classC.add(name);
                System.out.println("You entered C class");
            }
            else{
                System.out.println("Such grades are unacceptable");
            }
        }
        if(classA.size() != 5){
            System.out.println("Pupils in A class are:"+classA);
            System.out.println("Your class has less than 5 pupils, you should search for them");

        }
        if(classB.size() != 5){
            System.out.println("Pupils in A class are:"+classB);
            System.out.println("Your class has less than 5 pupils, you should search for them");
        }

        if(classC.size() != 5){
            System.out.println("Pupils in A class are:"+classC);
            System.out.println("Your class has less than 5 pupils, you should search for them");

        }

    }
}
