package app.LogicaMenu.keys;

import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Funcionalidade {
    
    //este construtor sera extendido pelas subfuncionalidades
    public Funcionalidade(String id_funcionalidade, String nome, String tipo, String permissão, int nivel) {
        this.id_funcionalidade = id_funcionalidade;
        this.nome = nome;
        this.tipo = tipo;
        this.permissão = permissão;
        this.nivel = nivel;
    }

    public String id_funcionalidade;
    public String nome;
    public String tipo;
    public String permissão;
    public int nivel;
    public ArrayList<SubFuncionalidade> sub_funcionalidades;

    //construtor unico das Funcionalidades, e elas possuem um array de Subfuncionalidades
    public  Funcionalidade(String id_funcionalidade, String nome, String tipo, String permissão, int nivel,
            ArrayList<SubFuncionalidade> sub_funcionalidades) {
        this.id_funcionalidade = id_funcionalidade;
        this.nome = nome;
        this.tipo = tipo;
        this.permissão = permissão;
        this.nivel = nivel;
        this.sub_funcionalidades = sub_funcionalidades;
    }



    public String getId_funcionalidade() {
        return id_funcionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPermissão() {
        return permissão;
    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<SubFuncionalidade> getSub_funcionalidades() {
        return sub_funcionalidades;
    }



    public String getGrupo() {
        return null;
    }



    public ImageIcon getIcon() {
        return null;
    }



    public String[] getNomeSubFuncionalidades() {
        return null;
    }

}
