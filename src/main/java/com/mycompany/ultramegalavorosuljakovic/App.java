/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ultramegalavorosuljakovic;

/**
 *
 * @author Studente
 */
public class App {
    public static void main(String[] args) {
        // Creiamo il negozio
        Negozio negozio = new Negozio(100); // Impostiamo la dimensione massima del catalogo a 100

        // Creiamo un'istanza dell'interfaccia utente e avviamo il menu
        InterfacciaUtente ui = new InterfacciaUtente(negozio);
        ui.mostraMenu();
    }
}

