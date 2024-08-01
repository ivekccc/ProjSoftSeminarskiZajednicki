/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author x
 */
public class ZakazanTermin implements Serializable {
    private int zakazanTerminId;
    private Termin termin;
    private Korisnik korisnik;
    private Date moguceOtkazivanjeDo;

    public ZakazanTermin(int zakazanTerminId, Termin termin, Korisnik korisnik, Date moguceOtkazivanjeDo) {
        this.zakazanTerminId = zakazanTerminId;
        this.termin = termin;
        this.korisnik = korisnik;
        this.moguceOtkazivanjeDo = moguceOtkazivanjeDo;
    }


    public ZakazanTermin() {
    }

    public Termin getTermin() {
        return termin;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    public Korisnik getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(Korisnik korisnik) {
        this.korisnik = korisnik;
    }

    public Date getMoguceOtkazivanjeDo() {
        return moguceOtkazivanjeDo;
    }

    public void setMoguceOtkazivanjeDo(Date moguceOtkazivanjeDo) {
        this.moguceOtkazivanjeDo = moguceOtkazivanjeDo;
    }

    public int getZakazanTerminId() {
        return zakazanTerminId;
    }

    public void setZakazanTerminId(int zakazanTerminId) {
        this.zakazanTerminId = zakazanTerminId;
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
        final ZakazanTermin other = (ZakazanTermin) obj;
        if (!Objects.equals(this.termin, other.termin)) {
            return false;
        }
        return Objects.equals(this.korisnik, other.korisnik);
    }

    @Override
    public String toString() {
        return "ZakazanTermin{" + "termin=" + termin + ", korisnik=" + korisnik + ", moguceOtkazivanjeDo=" + moguceOtkazivanjeDo + '}';
    }
    
}
