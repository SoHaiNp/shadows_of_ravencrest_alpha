package util;

import java.io.IOException;

public class ClearScreenUtil {

    public void clearTheScreen(){
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

}
