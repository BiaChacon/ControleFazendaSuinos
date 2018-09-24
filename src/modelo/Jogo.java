package modelo;

import java.sql.Date;

public class Jogo {
    private Date dataHoraPartida;
    private String local, adversario, competicao;
    private double lucroPartida;

    public Jogo(Date dataHoraPartida, String local, String adversario, String competicao, double lucroPartida) {
        this.dataHoraPartida = dataHoraPartida;
        this.local = local;
        this.adversario = adversario;
        this.competicao = competicao;
        this.lucroPartida = lucroPartida;
    }
    
    public double getLucroPartida() {
        return lucroPartida;
    }

    public void setLucroPartida(double lucroPartida) {
        this.lucroPartida = lucroPartida;
    }
 
    public Date getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(Date dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getAdversario() {
        return adversario;
    }

    public void setAdversario(String adversario) {
        this.adversario = adversario;
    }

    public String getCompeticao() {
        return competicao;
    }

    public void setCompeticao(String competicao) {
        this.competicao = competicao;
    }
 
}
