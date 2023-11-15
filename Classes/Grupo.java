package app.LogicaMenu;

import java.util.ArrayList;
import javax.swing.Icon;

import app.LogicaMenu.keys.*;

public class Grupo {

    String nomeGrupo;
    Icon icon;// este icon é o Icon da funcionalidade
    Funcionalidade funcionalidade;// A funcionalidade principal
    ArrayList<SubFuncionalidade> subFuncionalidades;// array de subfuncionalidades dentro da Funcionalidade principal

    public Grupo(String nomeGrupo, Icon icon, Funcionalidade funcionalidade,
            ArrayList<SubFuncionalidade> subFuncionalidades) {
        this.nomeGrupo = nomeGrupo;
        this.icon = icon;
        this.funcionalidade = funcionalidade;
        this.subFuncionalidades = subFuncionalidades;
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public Icon getIcon() {
        return icon;
    }

    public Funcionalidade getFuncionalidade() {
        return funcionalidade;
    }

    public ArrayList<SubFuncionalidade> getSubFuncionalidades() {
        return subFuncionalidades;
    }

    public String[] getNomesSubFuncionalidades() {
        return null;
    }

    public String getNomeFuncionalidade() {
        return null;
    }

}