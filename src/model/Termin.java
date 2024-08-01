/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author x
 */
public class Termin implements Serializable {
    private int terminId;
    private Date datum;
    private String vremePocetka;
    private String vremeZavrsetka;
    private boolean zakazan;

    public Termin(int terminId, Date datum, String vremePocetka, String vremeZavrsetka, boolean zakazan) {
        this.terminId = terminId;
        this.datum = datum;
        this.vremePocetka = vremePocetka;
        this.vremeZavrsetka = vremeZavrsetka;
        this.zakazan = zakazan;
    }

    public Termin() {
    }

    public int getTerminId() {
        return terminId;
    }

    public void setTerminId(int terminId) {
        this.terminId = terminId;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public String getVremePocetka() {
        return vremePocetka;
    }

    public void setVremePocetka(String vremePocetka) {
        this.vremePocetka = vremePocetka;
    }

    public String getVremeZavrsetka() {
        return vremeZavrsetka;
    }

    public void setVremeZavrsetka(String vremeZavrsetka) {
        this.vremeZavrsetka = vremeZavrsetka;
    }

    public boolean isZakazan() {
        return zakazan;
    }

    public void setZakazan(boolean zakazan) {
        this.zakazan = zakazan;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Termin other = (Termin) obj;
        return this.terminId == other.terminId;
    }

    @Override
    public String toString() {
        return "Termin{" + "terminId=" + terminId + ", datum=" + datum + ", vremePocetka=" + vremePocetka + ", vremeZavrsetka=" + vremeZavrsetka + ", zakazan=" + zakazan + '}';
    }
    
    
}
