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
        FuncoesLista.adicionar(new AgendaDeNomes("Ana Júlia"));
        FuncoesLista.adicionar(new AgendaDeNomes("Júlia"));
        FuncoesLista.adicionar(new AgendaDeNomes("Rafael"));
        FuncoesLista.adicionar(new AgendaDeNomes("Bianca"));
        FuncoesLista.adicionar(new AgendaDeNomes("Joana"));
        FuncoesLista.adicionar(new AgendaDeNomes("José"));
        FuncoesLista.adicionar(new AgendaDeNomes("José"));
        FuncoesLista.adicionar(new AgendaDeNomes(""));

        FuncoesLista.remover(new AgendaDeNomes("José"));
        FuncoesLista.ordenaDesc();
        FuncoesLista.ordenaAsc();
        FuncoesLista.removeDuplicados();
        FuncoesLista.aplicaTRIM();
        FuncoesLista.aplicaMaiusculo();
        FuncoesLista.aplicaMinusculo();
        FuncoesLista.aplicaCapitalize();
        FuncoesLista.imprimeLista();




    }

    
}
