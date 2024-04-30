/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._megalavoro_suljakovicemir;

/**
 *
 * @author Studente
 */
import java.util.Scanner;

public class interfacciaUtente {
    private Negozio negozio;
    private Scanner scanner;

    public interfacciaUtente(Negozio negozio) {
        this.negozio = negozio;
        this.scanner = new Scanner(System.in);
    }

    public void mostraMenu() {
        System.out.println("Benvenuto nel sistema di gestione del negozio di elettronica!");
        System.out.println("Seleziona un'opzione:");
        System.out.println("1. Visualizza catalogo prodotti");
        System.out.println("2. Effettua un acquisto");
        System.out.println("3. Visualizza report vendite");
        System.out.println("4. Esci");

        int scelta = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline rimasto nel buffer

        switch (scelta) {
            case 1:
                visualizzaCatalogoProdotti();
                break;
            case 2:
                effettuaAcquisto();
                break;
            case 3:
                generaReportVendite();
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

    public void visualizzaCatalogoProdotti() {
        System.out.println("Catalogo prodotti:");
        for (Prodotto prodotto : negozio.getCatalogoProdotti()) {
            System.out.println("- " + prodotto.getNome() + " (" + prodotto.getQuantita() + " disponibili) - " + prodotto.getPrezzo() + "€");
        }
        mostraMenu();
    }

    public void effettuaAcquisto() {
        // Implementa la logica per l'acquisto di un prodotto
    }

    public void generaReportVendite() {
        // Implementa la logica per generare e visualizzare il report delle vendite
        System.out.println("Funzionalità non ancora implementata.");
        mostraMenu();
    }
}
