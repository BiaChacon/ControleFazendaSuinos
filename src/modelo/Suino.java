package modelo;

import java.sql.Date;


public class Suino {
    int id;
    String nome;
    Date datanas;
    Date dataaqui;
   

    public Suino(int id, String nome, Date datanas, Date dataaqui) {
        this.id = id;
        this.nome = nome;
        this.datanas = datanas;
        this.dataaqui = dataaqui;
    }

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

    public Date getDatanas() {
        return datanas;
    }

    public void setDatanas(Date datanas) {
        this.datanas = datanas;
    }

    public Date getDataaqui() {
        return dataaqui;
    }

    public void setDataaqui(Date dataaqui) {
        this.dataaqui = dataaqui;
    }

    
    
}
