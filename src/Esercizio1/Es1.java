package Esercizio1;

import java.util.HashSet;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<String> set = new HashSet<>();
        HashSet<String> paroleRipetute = new HashSet<>();

        int numElementi = 0;

        System.out.println("Inserisci un numero che corrisponderà al numero di elementi del da inserire:");

        try {
            numElementi = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.out.println("Il valore inserito non è valido");
        }

        for (int i = 0; i < numElementi; i++) {
            System.out.println("Ora inserisci una parola da inserire nel set: ");
            String parola = input.nextLine();
            if (set.contains(parola)) paroleRipetute.add(parola);
            else set.add(parola);
        }

        System.out.println("Le/a parole/a ripetute/a sono: " + paroleRipetute.toString());
        System.out.println("Il numero di parole distinte è " + set.size());
        System.out.println("Il set che hai formato è: " + set.toString());
    }
}
