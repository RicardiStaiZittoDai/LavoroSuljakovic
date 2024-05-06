/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ultramegalavorosuljakovic;

/**
 *
 * @author Studente
 */
import java.time.LocalDateTime;

public class Vendita {
    private static int counter = 0;
    private int id;
    private LocalDateTime data;
    private Prodotto[] prodotti;
    private double totale;

    public Vendita(LocalDateTime data, Prodotto[] prodotti, double totale) {
        this.id = ++counter;
        this.data = data;
        this.prodotti = prodotti;
        this.totale = totale;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Prodotto[] getProdotti() {
        return prodotti;
    }

    public void setProdotti(Prodotto[] prodotti) {
        this.prodotti = prodotti;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }

    @Override
    public String toString() {
        StringBuilder prodottiString = new StringBuilder();
        for (Prodotto prodotto : prodotti) {
            prodottiString.append(prodotto).append(", ");
        }
        return "Vendita{" +
                "id=" + id +
                ", data=" + data +
                ", prodotti=" + prodottiString.toString() +
                ", totale=" + totale +
                '}';
    }
}
