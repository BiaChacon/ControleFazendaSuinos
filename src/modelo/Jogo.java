package modelo;

import java.sql.Date;

/**
 *
 * @author bh_chacon & igor
 */
public class Jogo {
    private Date dataHoraPartida;
    private String local, adversario;
    private double lucroPartida;

    public Jogo(Date dataHoraPartida, String local, String adversario, double lucroPartida) {
        this.dataHoraPartida = dataHoraPartida;
        this.local = local;
        this.adversario = adversario;
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
    

}
