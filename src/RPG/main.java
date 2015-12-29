package RPG;

import menu.Start;
import ward.console.Console;

public class main {

    public static void main(String[] args) {
        Var.console = new Console();
        Var.console.setSize(500, 500);
        Var.console.build();
        Start.start();
    }
    
}
