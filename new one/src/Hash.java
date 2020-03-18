import java.util.HashMap;//связка данны

public class Hash {
    public static void main(String[] args) {
        HashMap<String,String> journal = new HashMap<String, String>();
        journal.put("ruslan", "5");
        System.out.println(journal.get("ruslan"));

    }
}
