import java.util.ArrayList;
import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Please enter the number of documents:");
        int n = scan.nextInt();
        int a;
        ArrayList arrayOfDocuments = new ArrayList();
        System.out.println("Please enter the numbers from the documents");
        for(int i = 0; i<n; i++){
            a = scan.nextInt();
            arrayOfDocuments.add(a);
        }
        arrayOfDocuments.remove(0);
        arrayOfDocuments.remove(n-2);
        if(arrayOfDocuments.size()<3){
            try {
                System.out.println(arrayOfDocuments.indexOf(0));
            } catch(IndexOutOfBoundsException bound){
                System.out.println("You have no number");
            }
        }
        if(arrayOfDocuments.size()%2 == 1){
            int mid = arrayOfDocuments.size()/2;
            arrayOfDocuments.remove(mid);
            System.out.println("Here the numbers from the documents that have left:");
            System.out.println(arrayOfDocuments);
        }
        else{
            int leftFromMid = (arrayOfDocuments.size()/2)-1;
            arrayOfDocuments.remove(leftFromMid);
            System.out.println("Here the numbers from the documents that have left:");
            System.out.println(arrayOfDocuments);
        }



    }
}
