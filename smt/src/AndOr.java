public class AndOr {
    public static void main(String[] args) {
            int age = 15;
            if (age > 7 && age <= 18)
                System.out.println("school child");
            else if (age >= 18 && age <= 24)
                System.out.println("student");
            else if (age >= 24 && age <= 63)
                System.out.println("employee");
            else
                System.out.println("pensioner");
        }
}


