public class DemoTest {
    public static void main(String[] args) {
        Sofa divan = new Sofa();
        Table stol = new Table();
        //divan.razobrat();
        //stol.sobrat();
        /*Furniture f;
        f = stol;
        f.sobrat();
        f = divan;
        f.razobrat();
        */
        sborshik(divan);
        sborshik(stol);

    }
    static void sborshik(Furniture table){
        table.razobrat();
    }
    //static void sborshik(Furniture sofa){
        //sofa.sobrat();
    //}
}
