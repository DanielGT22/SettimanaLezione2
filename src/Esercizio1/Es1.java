package Esercizio1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("quante parole vuoi inserire?: ");
        int numero = scanner.nextInt();
        ArrayList<String> parole = new ArrayList<>();
        Set<String> paroleDuplicate = new HashSet<>();

        for (int i = 0; i < numero; i++) {
            System.out.print("Inserisci la parola numero " + (i + 1) + ": ");
            String parola = scanner.next();
            if (parole.contains(parola)) {
                paroleDuplicate.add(parola);
            } else {
                parole.add(parola);
            }
        }
        if (!paroleDuplicate.isEmpty()) {
            System.out.println("Le parole duplicate sono: " + paroleDuplicate);
        }

        ArrayList<String> paroleDistinte = new ArrayList<>(parole);
        paroleDistinte.removeAll(paroleDuplicate);

        if (!paroleDistinte.isEmpty()) {
            System.out.println("Le parole distinti sono: " + paroleDistinte);
        } else {
            System.out.println("Tutte le parole sono duplicati.");
        }

        System.out.println("Lista di parole: " + parole);
        System.out.println("Numero di parole distinte sono: " + paroleDistinte.size());




        scanner.close();
    }
}
