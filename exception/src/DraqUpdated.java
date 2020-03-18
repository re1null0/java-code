import java.util.Scanner;
import java.util.logging.SocketHandler;

public class DraqUpdated {
    DrawUpdated [] box;
    Scanner in = new Scanner();
    DynBox(){
        box = new DrawUpdated[0];

    }
    void addBox(DrawUpdated b){
        resizeBox();
        box[box.length-1] = b;

    }
    void resizeBox(){
        DrawUpdated[] b = new DrawUpdated[box.length+1];
        for (int i = 0; i< box.length; i++){
            b[i] = box[i];
        }
        box = b;;;;
    }

    void showBox(){
        System.out.println("enter which box to show");
        int i = in.nextInt();
    }
}
