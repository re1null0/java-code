public class A {
    public static void main(String[] args) {
        char[][] array = {
            {'0','0','2','0'},
            {'2','0','2','0'},
            {'2','2','2','0'},
            {'0','0','2','0'}};
        for(int i = 0; i<=array.length; i++){
            for (int a = 0; a<array[0].length; a++){
                boolean isTwo = (array[0][a] == '2') && (array[1][a] == '2') && (array[2][a] == '2') && (array[3][a] == '2');
                if(isTwo){
                    System.out.println("you're escaped");
                }

            }
        }

    }
}
