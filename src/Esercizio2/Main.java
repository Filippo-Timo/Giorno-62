package Esercizio2;

import java.util.Scanner;

import static Esercizio2.Metodi.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("**************************************** PRIMA FUNZIONE ****************************************");
        System.out.println("Inserisci il numero di elementi che deve avere la lista: ");
        int num = input.nextInt();
        generaLista(num);

        System.out.println("**************************************** SECONDA FUNZIONE ****************************************");
        System.out.println("Inserisci un numero, il programma genererà una lista delle dimensioni del numero che hai scritto e la stessa specchiata: ");
        int num2 = input.nextInt();
        generaMirrorList(generaLista(num2));

        System.out.println("**************************************** TERZA FUNZIONE ****************************************");
        System.out.println("Inserisci un numero e scrivere true per stampare i numeri in posizione pari o false per stampare i numeri in posizione dispari ");
        int num3 = input.nextInt();
        boolean x = input.nextBoolean();
        pariODispari(generaLista(num3), x);
    }
}
