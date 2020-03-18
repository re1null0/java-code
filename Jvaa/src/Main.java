import java.util.Scanner;
public class Main {

    static int percent=0;
    static int counter=0;
    static boolean[] isHaveAnswer={false,false,false,false,false};
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        String text;
        Scanner in=new Scanner(System.in);
        do{
            System.out.print("Are you ready?(yes/no)");
            text=in.nextLine();
        }while(!text.equals("yes"));

        do{
            System.out.print("Enter number of question: ");

        }while(question(in.nextLine()));
        System.out.println("Percent of knowledge is "+percent+"%");
        System.out.println("Never give up");
    }
    public static boolean question(String number){
        counter++;
        switch (number){
            case "#1":
                if(isHaveAnswer[0]){
                    System.out.println("You answered this question");
                    break;
                }else {
                    isHaveAnswer[0]=true;
                }
                System.out.print("Your answer to the first question:");
                if(in.nextLine().equals("a")) {
                    isHaveAnswer[0]=true;
                    percent+=10;
                    System.out.println("Ok, good answer");}
                else{
                    System.out.println("Ok, go ahead");
                }
                break;
            case "#2":
                if(isHaveAnswer[1]){
                    System.out.println("You answered this question");
                    break;
                }else{
                    isHaveAnswer[1]=true;
                }
                System.out.print("Your answer to the second question:");
                if(in.nextLine().equals("c") ) {percent+=25;
                    System.out.println("Ok, good answer");}
                else{
                    System.out.println("Ok, go ahead");
                }
                break;
            case "#3":
                if(isHaveAnswer[2]){
                    System.out.println("You answered this question");
                    break;
                }else{
                    isHaveAnswer[2]=true;
                }
                System.out.print("Your answer to the third question:");
                if(in.nextLine().equals("a")) {percent+=15;
                    System.out.println("Ok, good answer");}
                else{
                    System.out.println("Ok, go ahead");
                }
                break;
            case "#4":
                if(isHaveAnswer[3]){
                    System.out.println("You answered this question");
                    break;
                }else{
                    isHaveAnswer[3]=true;
                }
                System.out.print("Your answer to the fourth question:");
                if(in.nextLine().equals("c")) {percent+=30;
                    System.out.println("Ok, good answer");}
                else{
                    System.out.println("Ok, go ahead");
                }
                break;
            case "#5":
                if(isHaveAnswer[4]){
                    System.out.println("You answered this question");
                    break;
                }else{
                    isHaveAnswer[4]=true;
                }
                System.out.print("Your answer to the fifth question:");
                if(in.nextLine().equals("b")) {percent+=20;
                    System.out.println("Ok, good answer");}
                else{
                    System.out.println("Ok, go ahead");
                }
                break;
            default: counter--;
                System.out.print("Please, ");
        }
        return counter!=5;
    }


}
