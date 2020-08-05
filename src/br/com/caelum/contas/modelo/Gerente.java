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
public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    @Override
    public double getBonificacao(){
        return super.getBonificacao() + 1000;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumeroDeFuncionariosGerenciados() {
        return numeroDeFuncionariosGerenciados;
    }

    public void setNumeroDeFuncionariosGerenciados(int numeroDeFuncionariosGerenciados) {
        this.numeroDeFuncionariosGerenciados = numeroDeFuncionariosGerenciados;
    }
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido");
        }else {
            System.out.println("Acesso Negado");
            return false;
        }
        return true;
    }
}
