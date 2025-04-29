package com.workintech.sqldmlprocedures.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "kitap")
public class Kitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long kitapno;
    private String ad;
    private int puan;
    private long yazarno;
    private long turno;

    public void setPuan(int puan) {
        this.puan = puan;
    }

    public int getPuan() {
        return puan;
    }

    public long getKitapno() {
        return kitapno;
    }

    public long getTurno() {
        return turno;
    }

    public long getYazarno() {
        return yazarno;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setKitapno(long kitapno) {
        this.kitapno = kitapno;
    }
}
