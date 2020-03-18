
public class Alien {
    String name = "Ailey";
    int height = 120;
    int weight = 58;
    String colour = "Purple";
    String colourchanged = "Blue";
    void hello(){
        System.out.println("Hi, my name is: "+name);
        System.out.println("So, my height is: "+height + " My weight is: "+ weight + "My colour is: "+ colour);
    }
    void eat(int kilogramms){
        kilogramms = 0;
        if(kilogramms > 1){
            System.out.println("Oh no my colour is changing to " + colourchanged );
        }
        else{
            System.out.println("Thank you!");
        }
    }
}
