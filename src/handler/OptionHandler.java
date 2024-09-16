package handler;

import java.util.Scanner;

public class OptionHandler {

    private final Scanner readChosenOption;

    public OptionHandler(){
        readChosenOption = new Scanner(System.in);
    }

    public int returnChosenOption(){
        int chosenOption = readChosenOption.nextInt();
        readChosenOption.nextLine(); // Limpa o buffer do Scanner...
        return chosenOption;
    }

}
