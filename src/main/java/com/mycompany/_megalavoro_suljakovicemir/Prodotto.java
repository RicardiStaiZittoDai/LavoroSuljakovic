/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._megalavoro_suljakovicemir;

/**
 *
 * @author Studente
 */
import java.time.LocalDate;

public class Prodotto 
{
    private int id;
    private String nome;
    private String marca;
    private double prezzo;
    private int quantita;
    private String descrizione;
    private LocalDate dataDiProduzione;

    public Prodotto(int id, String nome, String marca, double prezzo, int quantita, String descrizione, LocalDate dataDiProduzione) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.descrizione = descrizione;
        this.dataDiProduzione = dataDiProduzione;
    }

    // Metodi getter e setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public LocalDate getDataDiProduzione() {
        return dataDiProduzione;
    }

    public void setDataDiProduzione(LocalDate dataDiProduzione) {
        this.dataDiProduzione = dataDiProduzione;
    }
}


