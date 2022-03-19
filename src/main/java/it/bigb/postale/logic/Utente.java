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
    public static final String NO_NAME = "unknown";
    public static final String NO_SURNAME = "unknown";
    public static final String INVALID_NUMBER = "phone number is invalid";
    public static final int MAX_AGE = 110;

    public Utente() {
    }

    public Utente(String nome, String cognome, int annoNascita, String numeroCellulare, UtenteType utenteType) {
        this.setNome(nome);
        this.setCognome(cognome);
        this.setAnnoNascita(annoNascita);
        this.setNumeroCellulare(numeroCellulare);
        this.setUtenteType(utenteType);
        
    }

    public String getNome() {
        return nome;
    }

    public final void setNome(String nome) {
        if(nome != null && ! nome.isEmpty()){
            this.nome = nome;
        }
        else{
            this.nome = NO_NAME;
        }
    }

    public String getCognome() {
        return cognome;
    }

    public final void setCognome(String cognome) {
        if(cognome != null && ! cognome.isEmpty()){
            this.cognome = cognome;
        }
        else{
            this.cognome = NO_SURNAME;
        }
    }

    public int getAnnoNascita() {
        return annoNascita;
    }

    public final void setAnnoNascita(int annoNascita) {
        if(annoNascita > 0 && annoNascita <= MAX_AGE ){
            this.annoNascita = annoNascita;
        }
        else{
            this.annoNascita = -1;
        }
    }

    public String getNumeroCellulare() {
        return numeroCellulare;
    }

    public final void setNumeroCellulare(String numeroCellulare) {
        if (numeroCellulare.matches("^\\+[1-9]{2}.\\d{1,11}$")){
            this.numeroCellulare = numeroCellulare;
        }else {
            this.numeroCellulare=INVALID_NUMBER;
        }
        
    }

    public UtenteType getUtenteType() {
        return utenteType;
    }

    public final void setUtenteType(UtenteType utenteType) {
        this.utenteType = utenteType;
    }
    
    
    
}
