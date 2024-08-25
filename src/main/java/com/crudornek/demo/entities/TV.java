package com.crudornek.demo.entities;
import jakarta.persistence.*;

@Entity
@Table(name="kanal_icerik")
public class TV {
    @Id
    @Column (name="kanal_numaracol")
    private Integer kanalnumara;
    @Column (name="kanal_adi")
    private String kanaladi;
    @Column (name="kanal_icerikcol")
    private String kanalicerik;

    public TV(){

    }

    public TV(Integer kanalnumara,String kanaladi,String kanalicerik) {
        this.kanalnumara = kanalnumara;
        this.kanaladi = kanaladi;
        this.kanalicerik = kanalicerik;
    }

    public Integer getKanalnumara() {

        return kanalnumara;
    }

    public void setKanalnumara(Integer kanalnumara)
    {
        this.kanalnumara = kanalnumara;
    }

    public String getKanaladi() {

        return kanaladi;
    }

    public void setKanaladi(String kanaladi) {

        this.kanaladi = kanaladi;
    }

    public String getKanalicerik() {

        return kanalicerik;
    }

    public void setKanalicerik(String kanalicerik) {

        this.kanalicerik = kanalicerik;
    }

    @Override
    public String toString() {
        return "TV{" +
                "kanalnumara=" + kanalnumara +
                ", kanaladi='" + kanaladi + '\'' +
                ", kanalicerik='" + kanalicerik + '\'' +
                '}';
    }
}
