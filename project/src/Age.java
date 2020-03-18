public class Age {
    public static void main(String[] args) {
        int age = 18;
        age/=10;
        switch (age){
            case 0:
                System.out.println("School child");
                break;
            case 1:
                System.out.println("student");
                break;
            case 2:
                System.out.println("employee");
                break;
            default:
                    System.out.println("pensioneer");
                    break;
            }
        }
    }









