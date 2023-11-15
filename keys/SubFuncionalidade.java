package app.LogicaMenu.keys;
public class SubFuncionalidade extends Funcionalidade {
    private String id_subfuncionalidade;

    public SubFuncionalidade(String id_funcionalidade,String id_subfuncionalidade, String nome, String tipo, int nivel, String permissão) {
        super(id_funcionalidade, nome, tipo, permissão, nivel);
        this.id_subfuncionalidade=id_subfuncionalidade;
    }

    public String getId_Sub_funcionalidade() {
        return id_subfuncionalidade;
    }
}