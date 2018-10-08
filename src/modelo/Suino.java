package modelo;


public class Suino {
    int id;
    String nome;
    int datanas;
    int dataaqui;
   

    public Suino(int id, String nome, int datanas, int dataaqui) {
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

    public int getDatanas() {
        return datanas;
    }

    public void setDatanas(int datanas) {
        this.datanas = datanas;
    }

    public int getDataaqui() {
        return dataaqui;
    }

    public void setDataaqui(int dataaqui) {
        this.dataaqui = dataaqui;
    }

    
    
}
