package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.main.SistemaBancario;

import br.com.caelum.javafx.api.main.TelaDeContas;


public class TesteConta {
    public static void main(String [] args){
        /*Conta conta = new Conta();
        
        conta.setNumeroConta(19258);
        conta.setTitular("Mailon bruno");
        conta.setAgencia("0818");
        System.out.print(conta.setData(29, 2, 2027));
        
        conta.deposita(800);
        
        System.out.println(conta.getTitular());
        System.out.println(conta.getNumeroConta());
        System.out.println(conta.getAgencia());
        System.out.println(conta.getIdentificadorConta());
        System.out.println(conta.getSaldo());
        System.out.println(conta.getDataAbertura());
        */    
        //TelaDeContas.main(args);
        SistemaBancario.mostraTela(true);
}
        
}
