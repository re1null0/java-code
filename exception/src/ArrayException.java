public class ArrayException {
    public static void main(String[] args) {
        int [] array = new int[3];
        try{
            System.out.println(array[4]);
        }catch (ArrayIndexOutOfBoundsException bound){
            System.out.println("its impossible");
        }
    }
}
