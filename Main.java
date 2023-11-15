package app.LogicaMenu;

import javax.swing.ImageIcon;

import app.LogicaMenu.keys.Funcionalidade;
import app.LogicaMenu.keys.SubFuncionalidade;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Funcionalidade> funcionalidades = fazerFuncionalidades();

        ArrayList<Grupo> grupos = new ArrayList<>();
        for (Funcionalidade funcionalidade : funcionalidades) {
            Grupo novoGrupo = new Grupo(funcionalidade.tipo, new ImageIcon(funcionalidade.id_funcionalidade + ".svg"),
                    funcionalidade, funcionalidade.sub_funcionalidades);
            grupos.add(novoGrupo);
        }

        String nomeMenu = "Menu Lateral";

        MenuLateral menu = new Menu(nomeMenu, grupos);
        MenuLateral.apresentar();

    }

    private static ArrayList<SubFuncionalidade> fazerSubFuncionalidade(Funcionalidade x) {

        ArrayList<SubFuncionalidade> subFuncionalidades = new ArrayList<>();

        SubFuncionalidade subFuncionalidade1 = new SubFuncionalidade(x.id_funcionalidade, "adicionar_Funcionarios",
                "Adicionar Funcionarios", "Permissão de Departamento", 3, x.permissão);
        SubFuncionalidade subFuncionalidade2 = new SubFuncionalidade(x.id_funcionalidade, "adicionar_Funcionarios",
                "Adicionar Funcionarios", "Permissão de Cargo", 3, x.permissão);
        SubFuncionalidade subFuncionalidade3 = new SubFuncionalidade(x.id_funcionalidade, "adicionar_Funcionarios",
                "Adicionar Funcionarios", "Permissões Temporarias", 3, x.permissão);
        SubFuncionalidade subFuncionalidade4 = new SubFuncionalidade(x.id_funcionalidade, "adicionar_Funcionarios",
                "Adicionar Funcionarios", "Permissões Gerais", 3, x.permissão);

        subFuncionalidades.add(subFuncionalidade1);
        subFuncionalidades.add(subFuncionalidade2);
        subFuncionalidades.add(subFuncionalidade3);
        subFuncionalidades.add(subFuncionalidade4);

        return subFuncionalidades;
    }

    private static ArrayList<Funcionalidade> fazerFuncionalidades() {

        ArrayList<Funcionalidade> funcionalidades = fazerFuncionalidades();
        Funcionalidade x = new Funcionalidade("Cadastrar_funcionario", "Criar Funcionario", "Permissão de Classe",
                "gerirfuncionarios", 5, null);

        x.sub_funcionalidades = fazerSubFuncionalidade(x);

        return null;
    }

}