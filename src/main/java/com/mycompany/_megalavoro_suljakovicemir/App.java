/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._megalavoro_suljakovicemir;

import java.time.LocalDate;

/**
 *
 * @author Studente
 */
public class App {
    public static void main(String[] args) {
        // Creiamo il negozio
        Negozio negozio = new Negozio();

        // Creiamo alcuni prodotti di esempio e li aggiungiamo al negozio
        Prodotto prodotto1 = new Prodotto(1, "Smartphone", "Samsung", 599.99, 10, "Smartphone di ultima generazione", LocalDate.of(2024, 4, 30));
        Prodotto prodotto2 = new Prodotto(2, "Smart TV", "LG", 899.99, 5, "Smart TV con schermo 4K", LocalDate.of(2024, 4, 25));
        negozio.aggiungiProdotto(prodotto1);
        negozio.aggiungiProdotto(prodotto2);

        // Creiamo un'istanza dell'interfaccia utente e avviamo il menu
        interfacciaUtente ui = new interfacciaUtente(negozio);
        ui.mostraMenu();
    }
}
