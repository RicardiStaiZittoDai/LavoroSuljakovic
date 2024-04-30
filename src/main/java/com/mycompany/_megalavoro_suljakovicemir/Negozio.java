/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._megalavoro_suljakovicemir;

/**
 *
 * @author Studente
 */
import java.util.ArrayList;

public class Negozio {
    private ArrayList<Prodotto> catalogoProdotti;
    private ArrayList<Vendita> vendite;

    public Negozio() {
        this.catalogoProdotti = new ArrayList<>();
        this.vendite = new ArrayList<>();
    }

    public void aggiungiProdotto(Prodotto prodotto) {
        catalogoProdotti.add(prodotto);
    }

    public void registraVendita(Vendita vendita) {
        vendite.add(vendita);
    }

    public void rimuoviProdotto(Prodotto prodotto) {
    catalogoProdotti.remove(prodotto);
}

    Iterable<Prodotto> getCatalogoProdotti() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
