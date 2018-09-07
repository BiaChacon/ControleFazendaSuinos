package modelo;

import java.util.ArrayList;

/**
 *
 * @author bh_chacon
 */
public class Financeiro {
    private double taxaEstadio;

    public Financeiro(double taxaEstadio, Time x) {
        this.taxaEstadio = taxaEstadio;
        this.x = x;
    }

    public double getTaxaEstadio() {
        return taxaEstadio;
    }

    public void setTaxaEstadio(double taxaEstadio) {
        this.taxaEstadio = taxaEstadio;
    }

    public Time getX() {
        return x;
    }

    public void setX(Time x) {
        this.x = x;
    }
    private ArrayList<Atleta> listaAtleta = new ArrayList<>();
    private ArrayList<Jogo> listaJogo = new ArrayList<>();
    Time x;
    
    public double somaSalario(){
        double soma=0;
        for(int i=0; i < listaAtleta.size(); i++){
            soma += listaAtleta.get(i).getSalario();
        }
        return soma;
    }
    public double somaLucro(){
        double somaLucroPartidas=0, somaLucroTotal=0;
        
        for (int i = 0; i < listaJogo.size(); i++){
            somaLucroPartidas += listaJogo.get(i).getLucroPartida();
        }
        return somaLucroTotal = somaLucroPartidas + x.getPatrocinio();
    }
    
}
