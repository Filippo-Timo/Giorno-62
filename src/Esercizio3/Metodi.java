package Esercizio3;

import java.util.HashMap;

public class Metodi {
    public HashMap<String, Integer> rubrica;

    public void Rubrica() {
        rubrica = new HashMap<>();
    }

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

    ;

}
