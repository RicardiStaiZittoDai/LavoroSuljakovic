/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._megalavoro_suljakovicemir;

/**
 *
 * @author Studente
 */
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Vendita {
    private int id;
    private LocalDateTime data;
    private ArrayList<Prodotto> prodotti;
    private double totale;

    public Vendita(int id, LocalDateTime data, ArrayList<Prodotto> prodotti, double totale) {
        this.id = id;
        this.data = data;
        this.prodotti = prodotti;
        this.totale = totale;
    }

    // Metodi getter e setter
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

    public ArrayList<Prodotto> getProdotti() {
        return prodotti;
    }

    public void setProdotti(ArrayList<Prodotto> prodotti) {
        this.prodotti = prodotti;
    }

    public double getTotale() {
        return totale;
    }

    public void setTotale(double totale) {
        this.totale = totale;
    }
}
