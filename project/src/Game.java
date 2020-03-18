public class Game {
    public static void main(String[] args) {
        int min = 0;
        int hour = 0;
        while(hour != 8 && min != 15)  {
            min++;
            if (min == 60){
                hour++;
                min = 0;
            }
            hour++;
            System.out.println(hour+":"+min);
        }
    }
}
