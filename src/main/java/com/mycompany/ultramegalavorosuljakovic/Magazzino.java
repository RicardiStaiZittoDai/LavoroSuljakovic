/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultramegalavorosuljakovic;

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
        if (quantita < 0) {
            throw new IllegalArgumentException("La quantità non può essere negativa.");
        }
        inventario.put(prodotto, inventario.getOrDefault(prodotto, 0) + quantita);
    }

    public void rimuoviProdotto(Prodotto prodotto, int quantita) {
        if (quantita < 0) {
            throw new IllegalArgumentException("La quantità non può essere negativa.");
        }
        if (inventario.containsKey(prodotto)) {
            int quantitaAttuale = inventario.get(prodotto);
            if (quantitaAttuale >= quantita) {
                inventario.put(prodotto, quantitaAttuale - quantita);
            } else {
                throw new IllegalArgumentException("Quantità disponibile nel magazzino non sufficiente.");
            }
        } else {
            throw new IllegalArgumentException("Il prodotto non è presente nel magazzino.");
        }
    }

    public int getQuantitaProdotto(Prodotto prodotto) {
        return inventario.getOrDefault(prodotto, 0);
    }

    public Map<Prodotto, Integer> getInventario() {
        return inventario;
    }
}

