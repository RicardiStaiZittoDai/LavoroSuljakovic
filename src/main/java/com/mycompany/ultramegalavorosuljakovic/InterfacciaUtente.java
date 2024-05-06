/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultramegalavorosuljakovic;

/**
 *
 * @author Studente
 */
import java.time.LocalDate;
import java.util.Scanner;

public class InterfacciaUtente {
    private Negozio negozio;
    private Scanner scanner;

    public InterfacciaUtente(Negozio negozio) {
        this.negozio = negozio;
        this.scanner = new Scanner(System.in);
    }

    public void mostraMenu() {
        System.out.println("Benvenuto nel sistema di gestione del negozio di elettronica!");
        System.out.println("Seleziona un'opzione:");
        System.out.println("1. Aggiungi prodotto");
        System.out.println("2. Rimuovi prodotto");
        System.out.println("3. Mostra catalogo prodotti");
        System.out.println("4. Esci");

        int scelta = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline rimasto nel buffer

        switch (scelta) {
            case 1:
                aggiungiProdotto();
                break;
            case 2:
                rimuoviProdotto();
                break;
            case 3:
                negozio.mostraCatalogoProdotti();
                break;
            case 4:
                System.out.println("Arrivederci!");
                System.exit(0);
                break;
            default:
                System.out.println("Opzione non valida. Riprova.");
                mostraMenu();
        }
    }

    private void aggiungiProdotto() {
        // Implementa la logica per l'aggiunta di un nuovo prodotto
    }

    private void rimuoviProdotto() {
        // Implementa la logica per la rimozione di un prodotto
    }
}
