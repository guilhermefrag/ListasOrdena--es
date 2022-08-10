package Controllers;

import Classes.AgendaDeNomes;
import java.util.ArrayList;

public class FuncoesLista {
    private static ArrayList<AgendaDeNomes> lista = new ArrayList<AgendaDeNomes>();

    public static void adicionar(AgendaDeNomes nome) {
        lista.add(nome);
    }

    public static void remover(AgendaDeNomes nome) {
        lista.remove(nome);
    }

    public static void imprimeLista(){
        for (AgendaDeNomes nome : lista) {
            System.out.println(nome.getNome());
        }
    }

    public static boolean ordenarAsc() {
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).getNome().compareTo(lista.get(j).getNome()) < 0) {
                    AgendaDeNomes aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    public static boolean ordenarDesc() {
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).getNome().compareTo(lista.get(j).getNome()) > 0) {
                    AgendaDeNomes aux = lista.get(i);
                    lista.set(i, lista.get(j));
                    lista.set(j, aux);
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    public static boolean removeDuplicados() {
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            for (int j = 0; j < lista.size(); j++) {
                if (lista.get(i).getNome().compareTo(lista.get(j).getNome()) == 0) {
                    lista.remove(j);
                    retorno = true;
                }
            }
        }
        return retorno;
    }

    public static boolean removeVazio(){
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().compareTo("") == 0) {
                lista.remove(i);
                retorno = true;
            }
        }
        return retorno;
    }

    public static boolean aplicaTRIM(){
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setNome(lista.get(i).getNome().trim());
            retorno = true;
        }
        return retorno;
    }

    public static boolean aplicaMaiusculo() {
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setNome(lista.get(i).getNome().toUpperCase());
            retorno = true;
        }
        return retorno;
    }

    public static boolean aplicaMinusculo() {
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setNome(lista.get(i).getNome().toLowerCase());
            retorno = true;
        }
        return retorno;
    }

    public static boolean aplicaCapitalize() {
        boolean retorno = false;
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).setNome(lista.get(i).getNome().substring(0, 1).toUpperCase() + lista.get(i).getNome().substring(1).toLowerCase());
            retorno = true;
        }
        return retorno;
    }

}