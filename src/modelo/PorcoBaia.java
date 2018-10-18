package modelo;

public class PorcoBaia {

    private int idPorco;
    private int idBaia;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PorcoBaia(int idPorco, int idBaia) {
        this.idPorco = idPorco;
        this.idBaia = idBaia;
    }

    public int getIdPorco() {
        return idPorco;
    }

    public void setIdPorco(int idPorco) {
        this.idPorco = idPorco;
    }

    public int getIdBaia() {
        return idBaia;
    }

    public void setIdBaia(int idBaia) {
        this.idBaia = idBaia;
    }

}
