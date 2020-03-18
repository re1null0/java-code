public class Var {
    public static void main(String... args) {
        System.out.println(sum(78,657,657));
    }

    static int sum(int... number){
        int i = 0;
        for (int b : number){
            i = i+b;
        }
        return i;
    }
}
