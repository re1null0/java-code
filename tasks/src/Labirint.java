import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Labirint {
    public static void main(String[] args) {
        Random random=new Random();
        Scanner inpuNames=new Scanner(System.in);
        ArrayList<String> names=new ArrayList<>();
        String[][] teams;
        String name;
        int counOfTeams;
        boolean isEnd;
        do{
            System.out.println("Enter name");
            name=inpuNames.next();
            isEnd=name.equals("end");
            if(!isEnd){
                names.add(name);
            }
        }while(!isEnd);
        counOfTeams=names.size()/3;
        if(names.size()%3!=0){
            counOfTeams++;
        }

        teams=new String[counOfTeams][3];
        for(int a=0;a<teams.length;a++){
            for(int b=0;b<teams[0].length;b++){
                teams[a][b]=names.get(random.nextInt(names.size()-1));
                names.remove(teams[a][b]);
            }
        }
        for(int a=0;a<teams.length;a++){
            for(int b=0;b<teams[0].length;b++){
                System.out.println(teams[a][b]+" ");

            }
            System.out.println();
        }

    }


}
