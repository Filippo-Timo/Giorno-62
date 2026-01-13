package Esercizio3;

import java.util.HashMap;

public class Metodi {
    public HashMap<String, Integer> rubrica = new HashMap<>();

//    public void Rubrica() {
//        this.rubrica = rubrica;
//    }

    //    PRIMO METODO
    public void generaElemento(String name, int numeroDiTelefono) {
        rubrica.put(name, numeroDiTelefono);
    }

    //    SECONDO METODO
    public void cancellaElemento(String name) {
        rubrica.remove(name);
    }

    //    TERZO METODO
    public void cercaPerNumero(int numero) {
        rubrica.containsValue(numero);
    }

    //    QUARTO METODO
    public void cercaPerNome(String nome) {
        rubrica.get(nome);
    }

    //    QUINTO METODO
    public void stampaTutti(HashMap<String, Integer> rubrica) {
        System.out.println(rubrica.toString());
    }
}
