package app.LogicaMenu;



public class LogicaVisual {
    public static void main(String[] args) {
        String menu[][] = {

         // nome do grupo
         { "~Inicio~" },

         // Nome funcionalidade,  SubFuncionalidade1  
         { "Painel Inicial"      ,  "Ver perfil"          },

         // nome do grupo
         { "Permissões de Cargo" },

         // Nome funcionalidade,  SubFuncionalidade1       SubFuncionalidade2           SubFuncionalidade3          SubFuncionalidade4
         { "Gerir Funcionários"  ,"Ver Funcionários"       ,"Adicionar Funcionários"    , "Remover Funcionários"    ,"Atualizar Funcionários"  },
         { "Gerir Inventario "   ,"Adicionar Equipamento"  ,"Remover Equipamento"       , "Adicionar Equipamento"   ,"Apresentar Equipamento"  },
         { "Gerir Calendário"    ,"Adicionar Atividade"    ,"Criar Evento"              , "Remover Atividade"                                  },

         // nome do grupo
         { "~Permissões de Departamento~" },

         // Nome funcionalidade,  SubFuncionalidade1    SubFuncionalidade2      SubFuncionalidade3
         { "Gerir Cargos"        , "Criar Cargo"        , "Remover Cargo"      , "Atualizar Cargos"   },
         { "Funcionalidades "    , "Criar nova "        , "Elementos Avançados", "Editores", "baladd" },

         // nome do grupo
         { "Permissões Gerais" },

         // Nome funcionalidade,  SubFuncionalidade1     SubFuncionalidade2      SubFuncionalidade2
         { "Gráficos"            , "jogos"                , "Flot"            ,   "One piene"          },
         { "Ícones"              , "outra coisa"       , "Demon Slayer"      ,    "Jesus"         },
         { "Páginas Especiais"   , "FAQ"                 , "Perfil"          , "Linha do Tempo"       },
     };

    }
}