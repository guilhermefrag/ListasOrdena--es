import Classes.*;
import Controllers.*;

public class App {
    public static void main(String[] args) throws Exception {
        FuncoesLista.adicionar(new AgendaDeNomes("João"));
        FuncoesLista.adicionar(new AgendaDeNomes("Maria"));
        FuncoesLista.adicionar(new AgendaDeNomes("José"));
        FuncoesLista.adicionar(new AgendaDeNomes("Pedro"));
        FuncoesLista.adicionar(new AgendaDeNomes("Paulo"));
        FuncoesLista.adicionar(new AgendaDeNomes("Paulo Henrique"));
        FuncoesLista.adicionar(new AgendaDeNomes("Paulo"));
        FuncoesLista.adicionar(new AgendaDeNomes(""));
        FuncoesLista.adicionar(new AgendaDeNomes("Ana Júlia"));
        FuncoesLista.adicionar(new AgendaDeNomes("Júlia"));
        FuncoesLista.adicionar(new AgendaDeNomes("Rafael"));
        FuncoesLista.adicionar(new AgendaDeNomes("Bianca"));
        FuncoesLista.adicionar(new AgendaDeNomes("Joana"));
        FuncoesLista.adicionar(new AgendaDeNomes("José"));
        FuncoesLista.adicionar(new AgendaDeNomes("José"));

        
        FuncoesLista.ordenarAsc();
        FuncoesLista.ordenarDesc();
        FuncoesLista.aplicaTRIM();
        FuncoesLista.removeVazio();
        FuncoesLista.aplicaMaiusculo();
        FuncoesLista.aplicaMinusculo();
        FuncoesLista.aplicaCapitalize();
        /*
        Não consegui entender o porque ele está removendo os nomes que tem o inicio igual
        tipo Paulo Henrique, que é removido junto com os Paulos
        */
        FuncoesLista.removeDuplicados();
        FuncoesLista.imprimeLista();

    }
}
