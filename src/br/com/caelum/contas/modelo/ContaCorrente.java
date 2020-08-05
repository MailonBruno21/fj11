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
public class ContaCorrente extends Conta implements Tributavel{

    public String getTipo() {
        return super.getTipo() + " Corrente";
    }

    @Override
    public void saca(double valor) {
        this.saldo -= (valor + 0.10);
    }

    @Override
    public double getValorImposto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
