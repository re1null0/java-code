public class AliveDog {
    public static void main(String[] args){
        Dog doggy/*doggy is a object of Dog class*/ = new Dog();
        String title = "Dog's home";
        //title.contains();//не примитивный тип данных
        doggy.age = 4;
        //doggy.name = "Scooby Doo";
        doggy.poroda = "Chihuahua";
        doggy.barking();
        doggy.eating("Burger");
        doggy.setName("Aqtoes");
        doggy.nameis();
    }
}
