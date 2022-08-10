package Controllers;

import Classes.AgendaDeNomes;

public class FuncoesLista {
    
    private static AgendaDeNomes[] lista = new AgendaDeNomes[10];

    public static void adicionar(AgendaDeNomes nome) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == null) {
                lista[i] = nome;
                break;
            }
        }
    }

    public static void remover(AgendaDeNomes nome) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getNome().equals(nome.getNome())) {
                lista[i] = null;
                break;
            }
        }
    }

    public static void imprimeLista() {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                System.out.println(lista[i].getNome());
            }
        }
    }

    public static boolean ordenaAsc(){
        boolean ordenado = true;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] != null && lista[j] != null) {
                    if (lista[i].getNome().compareTo(lista[j].getNome()) > 0) {
                        AgendaDeNomes aux = lista[i];
                        lista[i] = lista[j];
                        lista[j] = aux;
                        ordenado = false;
                    }
                }
            }
        }
        return ordenado;
    }

    public static boolean ordenaDesc(){
        boolean ordenado = true;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] != null && lista[j] != null) {
                    if (lista[i].getNome().compareTo(lista[j].getNome()) < 0) {
                        AgendaDeNomes aux = lista[i];
                        lista[i] = lista[j];
                        lista[j] = aux;
                        ordenado = false;
                    }
                }
            }
        }
        return ordenado;
    }

    public static boolean removeDuplicados(){
        boolean removidos = true;
        for (int i = 0; i < lista.length; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i] != null && lista[j] != null) {
                    if (lista[i].getNome().equals(lista[j].getNome())) {
                        lista[j] = null;
                        removidos = false;
                    }
                }
            }
        }
        return removidos;
    }

    public static boolean aplicaTRIM(){
        boolean aplicado = true;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                lista[i].setNome(lista[i].getNome().trim());
            }
        }
        return aplicado;
    }

    public static boolean aplicaMaiusculo(){
        boolean aplicado = true;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                lista[i].setNome(lista[i].getNome().toUpperCase());
            }
        }
        return aplicado;
    }

    public static boolean aplicaMinusculo(){
        boolean aplicado = true;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                lista[i].setNome(lista[i].getNome().toLowerCase());
            }
        }
        return aplicado;
    }

    public static boolean aplicaCapitalize(){
        boolean aplicado = true;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                lista[i].setNome(lista[i].getNome().substring(0, 1).toUpperCase() + lista[i].getNome().substring(1).toLowerCase());
            }
        }
        return aplicado;
    }
}
