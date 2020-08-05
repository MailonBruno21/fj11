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
public class ContaPoupanca extends Conta{
    public String getTipo(){
        return super.getTipo() + " Poupança";
    }
}
