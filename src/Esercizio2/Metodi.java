package Esercizio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Metodi {


    public static ArrayList<Integer> generaLista(int n) {

        ArrayList<Integer> lista = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            lista.add(random.nextInt(100) + 1);
        }

        Collections.sort(lista);
        System.out.println(lista);
        return lista;
    }

    public static ArrayList<Integer> generaMirrorList(ArrayList<Integer> lista) {

        ArrayList<Integer> lista2 = new ArrayList<>();

        lista2.addAll(lista);
        Collections.reverse(lista);
        lista2.addAll(lista);

        System.out.println(lista2);
        return lista2;
    }

    public static void pariODispari(ArrayList<Integer> lista, boolean pari) {
        for (int i = 0; i < lista.size(); i++) {
            if (pari && i % 2 == 0) {
                System.out.println(lista.get(i));
            } else if (!pari && i % 2 != 0) {
                System.out.println(lista.get(i));
            }
        }
    }
}

