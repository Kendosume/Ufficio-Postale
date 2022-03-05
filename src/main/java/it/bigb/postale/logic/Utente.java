/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.bigb.postale.logic;

/**
 *
 * @author Matteo
 */
public class Utente {
    private String nome;
    private String cognome;
    private int annoNascita;
    private String numeroCellulare;
    private UtenteType utenteType;

    public Utente() {
    }

    public Utente(String nome, String cognome, int annoNascita, String numeroCellulare, UtenteType utenteType) {
        this.nome = nome;
        this.cognome = cognome;
        this.annoNascita = annoNascita;
        this.numeroCellulare = numeroCellulare;
        this.utenteType = utenteType;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public void setAnnoNascita(int annoNascita) {
        this.annoNascita = annoNascita;
    }

    public String getNumeroCellulare() {
        return numeroCellulare;
    }

    public void setNumeroCellulare(String numeroCellulare) {
        this.numeroCellulare = numeroCellulare;
    }

    public UtenteType getUtenteType() {
        return utenteType;
    }

    public void setUtenteType(UtenteType utenteType) {
        this.utenteType = utenteType;
    }
    
    
    
}
