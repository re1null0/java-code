/*public class Methods {
    public static void main(String[] args) {
       boolean isOk =  security(15);
       if (isOk) System.out.println(" you re welcome");
       else System.out.println("get out");
    }
    public static void security(int age){
        //System.out.println("hfbkjd");
        return age >=21;
    }
}
*/
public class Methods {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
    public static long factorial(int n){
        //System.out.println("hfbkjd");
        if (n == 1) return 1 ;
        return n * factorial(n-1);
    }
}
