package app.LogicaMenu;

import java.util.ArrayList;

public class Menu {

    String nomeMenu;
    ArrayList<Grupo> grupos;
    
    public Menu(String nomeMenu, ArrayList<Grupo> grupos) {
        this.nomeMenu = nomeMenu;
        this.grupos = grupos;
    }

    public static void apresentar() {
    }

}