package util;

import java.util.Scanner;

public class KeyListenerUtil {

    private final Scanner readChosenOption;

    public KeyListenerUtil(){
        readChosenOption = new Scanner(System.in);
    }

    public int getChosenOption(){
        int chosenOption = readChosenOption.nextInt();
        readChosenOption.nextLine(); // Limpa o buffer do Scanner...
        return chosenOption;
    }

    public void optionToProceed(){
        readChosenOption.nextInt();
    }
}
