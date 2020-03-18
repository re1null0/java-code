public class Multidimensional {
    public static void main(String[] args) {
        int [] arrays = {1 ,4 ,6 ,7};
        int i[][] = {
                {5, 60},
                {7, 9}};
        /*
        for(int index = 0; index < 2; index++){
            for(int j = 0; j < 2; j++){
                System.out.print(i[index][j]+" ");
            }
            System.out.println();


        }
        */
        for(int element : arrays){
            System.out.println(element + " ");
        }//для одномерного массива
        for(int element [] : i){
            for(int number : element){
                System.out.println(number);
            }
        }//для многомерного массива

    }
}
