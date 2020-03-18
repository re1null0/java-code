public class Exception {
    public static void main(String[] args) {
        int d = 0;
        int a = 10;
        try{
            int c= a/d;
            System.out.println(a+"divide by" + d + "equal to" + c);
        }catch (ArithmeticException nazvanieperemennoy){
            System.out.println("Can not divide by zero");
        }
    }
}
