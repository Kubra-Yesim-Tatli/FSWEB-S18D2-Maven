package com.workintech.sqldmlprocedures.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "ogrenci")
public class Ogrenci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ogrno;  // Öğrenci numarası, auto-generated

    private String ad;    // Öğrencinin adı
    private String soyad; // Öğrencinin soyadı
    private String cinsiyet; // Öğrencinin cinsiyeti (E/K gibi)
    private String sinif;    // Öğrencinin sınıfı (10A, 11B, vb.)
    private int puan;        // Öğrencinin puanı

    @Column(nullable = true)
    private String dtarih; // Doğum tarihi (isteğe bağlı)

    // Parametresiz constructor
    public Ogrenci() {}

    // Parametreli constructor
    public Ogrenci(Long ogrno, String ad, String soyad, String cinsiyet, String sinif, int puan, String dtarih) {
        this.ogrno = ogrno;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
        this.sinif = sinif;
        this.puan = puan;
        this.dtarih = dtarih;
    }

    // Getter ve Setter metodları
    public Long getOgrno() {
        return ogrno;
    }

    public void setOgrno(Long ogrno) {
        this.ogrno = ogrno;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public int getPuan() {
        return puan;
    }

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public String getDtarih() {
        return dtarih;
    }

    public void setDtarih(String dtarih) {
        this.dtarih = dtarih;
    }

    // toString metodu
    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrno=" + ogrno +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", sinif='" + sinif + '\'' +
                ", puan=" + puan +
                ", dtarih='" + dtarih + '\'' +
                '}';
    }

    // equals metodu
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ogrenci ogrenci = (Ogrenci) o;
        return ogrno.equals(ogrenci.ogrno);
    }

    // hashCode metodu
    @Override
    public int hashCode() {
        return ogrno.hashCode();
    }
}
