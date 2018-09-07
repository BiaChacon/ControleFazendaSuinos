package modelo;

import java.sql.Date;

/**
 *
 * @author bh_chacon
 */
public class Time {
    private String nome;
    private double patrocinio;
    private Date dataFundacao;
    

    public Time(String nome, double patrocinio, Date dataFundacao) {
        this.nome = nome;
        this.patrocinio = patrocinio;
        this.dataFundacao = dataFundacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(double patrocinio) {
        this.patrocinio = patrocinio;
    }

    public Date getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Date dataFundacao) {
        this.dataFundacao = dataFundacao;
    }
    
    
}
