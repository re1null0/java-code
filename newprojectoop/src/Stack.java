public class Stack {
    private String [] array = new String [10];
    private int counter = 0;
    void push(String name){
        counter++;
        array[counter] = name;
    }
    void top(){
        System.out.println(array[counter]);
    }
    void pop(){

    }
}
