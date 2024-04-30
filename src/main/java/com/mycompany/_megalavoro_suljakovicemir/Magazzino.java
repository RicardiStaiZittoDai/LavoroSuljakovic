/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._megalavoro_suljakovicemir;

/**
 *
 * @author Studente
 */
import java.util.HashMap;
import java.util.Map;

public class Magazzino {
    private Map<Prodotto, Integer> inventario;

    public Magazzino() {
        this.inventario = new HashMap<>();
    }

    public void aggiungiProdotto(Prodotto prodotto, int quantita) {
        if (inventario.containsKey(prodotto)) {
            int quantitaAttuale = inventario.get(prodotto);
            inventario.put(prodotto, quantitaAttuale + quantita);
        } else {
            inventario.put(prodotto, quantita);
        }
    }

    public void rimuoviProdotto(Prodotto prodotto, int quantita) {
        if (inventario.containsKey(prodotto)) {
            int quantitaAttuale = inventario.get(prodotto);
            if (quantitaAttuale >= quantita) {
                inventario.put(prodotto, quantitaAttuale - quantita);
            } else {
                System.out.println("Quantità disponibile nel magazzino non sufficiente.");
            }
        } else {
            System.out.println("Il prodotto non è presente nel magazzino.");
        }
    }

    public int getQuantitaProdotto(Prodotto prodotto) {
        return inventario.getOrDefault(prodotto, 0);
    }
}
