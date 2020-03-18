public class MyException extends ArithmeticException{
    public static void main(String[] args) {
        try{
            throw new MyException();
        }catch (MyException e){
            System.out.println("kojihdg");
        }
    }
}
