/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultramegalavorosuljakovic;

/**
 *
 * @author Studente
 */
public class Negozio {
    private Prodotto[] catalogoProdotti;
    private int numProdotti;

    public Negozio(int maxSize) {
        this.catalogoProdotti = new Prodotto[maxSize];
        this.numProdotti = 0;
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        if (numProdotti < catalogoProdotti.length) {
            catalogoProdotti[numProdotti++] = prodotto;
        } else {
            throw new IllegalArgumentException("Il catalogo dei prodotti è pieno.");
        }
    }

    public void rimuoviProdotto(int id) {
        int index = trovaProdottoIndex(id);
        if (index != -1) {
            for (int i = index; i < numProdotti - 1; i++) {
                catalogoProdotti[i] = catalogoProdotti[i + 1];
            }
            catalogoProdotti[numProdotti - 1] = null;
            numProdotti--;
        } else {
            throw new IllegalArgumentException("Prodotto non trovato.");
        }
    }

    public Prodotto trovaProdotto(int id) {
        int index = trovaProdottoIndex(id);
        if (index != -1) {
            return catalogoProdotti[index];
        } else {
            throw new IllegalArgumentException("Prodotto non trovato.");
        }
    }

    private int trovaProdottoIndex(int id) {
        for (int i = 0; i < numProdotti; i++) {
            if (catalogoProdotti[i].getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void mostraCatalogoProdotti() {
        System.out.println("Catalogo Prodotti:");
        for (int i = 0; i < numProdotti; i++) {
            System.out.println(catalogoProdotti[i]);
        }
    }

    // Aggiungi altri metodi se necessario
}
