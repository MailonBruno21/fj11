/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.caelum.contas.modelo;

/**
 *
 * @author Mailon Bruno
 */
public class SeguroDeVida implements Tributavel	{
    private double valor;
    private String titular;   
    private int numeroApolice;
    
    public double getValorImposto(){

        return 42 + this.valor * 0.02;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroApolice() {
        return numeroApolice;
    }

    public void setNumeroApolice(int numeroApolice) {
        this.numeroApolice = numeroApolice;
    }
    
    public String getTipo(){
	return "Seguro de Vida";
    }

    
}
