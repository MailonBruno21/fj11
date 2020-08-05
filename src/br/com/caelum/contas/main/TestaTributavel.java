package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;
import br.com.caelum.contas.modelo.Tributavel;
import br.com.caelum.javafx.api.main.SistemaBancario;

import br.com.caelum.javafx.api.main.TelaDeContas;

public class TestaTributavel	{
    public static void main(String[] args){
        ContaCorrente cc = new ContaCorrente();
	cc.deposita(100);
        System.out.println(cc.getValorImposto());
        Tributavel t = cc;
	System.out.println(t.getValorImposto());
    }
}
